(function(t){function e(e){for(var a,r,s=e[0],l=e[1],c=e[2],d=0,h=[];d<s.length;d++)r=s[d],i[r]&&h.push(i[r][0]),i[r]=0;for(a in l)Object.prototype.hasOwnProperty.call(l,a)&&(t[a]=l[a]);u&&u(e);while(h.length)h.shift()();return o.push.apply(o,c||[]),n()}function n(){for(var t,e=0;e<o.length;e++){for(var n=o[e],a=!0,s=1;s<n.length;s++){var l=n[s];0!==i[l]&&(a=!1)}a&&(o.splice(e--,1),t=r(r.s=n[0]))}return t}var a={},i={app:0},o=[];function r(e){if(a[e])return a[e].exports;var n=a[e]={i:e,l:!1,exports:{}};return t[e].call(n.exports,n,n.exports,r),n.l=!0,n.exports}r.m=t,r.c=a,r.d=function(t,e,n){r.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:n})},r.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},r.t=function(t,e){if(1&e&&(t=r(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var n=Object.create(null);if(r.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var a in t)r.d(n,a,function(e){return t[e]}.bind(null,a));return n},r.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return r.d(e,"a",e),e},r.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},r.p="/";var s=window["webpackJsonp"]=window["webpackJsonp"]||[],l=s.push.bind(s);s.push=e,s=s.slice();for(var c=0;c<s.length;c++)e(s[c]);var u=l;o.push([0,"chunk-vendors"]),n()})({0:function(t,e,n){t.exports=n("56d7")},"02b7":function(t,e,n){"use strict";var a=n("927a"),i=n.n(a);i.a},"0cc2":function(t,e,n){"use strict";var a=n("99a6"),i=n.n(a);i.a},"10df":function(t,e,n){},"37b1":function(t,e,n){},3912:function(t,e,n){"use strict";var a=n("cb67"),i=n.n(a);i.a},"40d2":function(t,e,n){"use strict";var a=n("37b1"),i=n.n(a);i.a},"4ae3":function(t,e){e.install=function(t){t.prototype.toHome=function(){this.$router.push("/home")},t.prototype.bacc=function(){var t=this.rollback.back();t&&this.$router.push(t)}}},"56d7":function(t,e,n){"use strict";n.r(e);n("cadf"),n("551c"),n("f751"),n("097d");var a=n("2b0e"),i=n("bc3a"),o=n.n(i),r={},s=o.a.create(r);s.interceptors.request.use(function(t){return t},function(t){return Promise.reject(t)}),s.interceptors.response.use(function(t){return t},function(t){return Promise.reject(t)}),Plugin.install=function(t,e){t.axios=s,window.axios=s,Object.defineProperties(t.prototype,{axios:{get:function(){return s}},$axios:{get:function(){return s}}})},a["a"].use(Plugin);Plugin;var l=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{attrs:{id:"app"}},[n("router-view")],1)},c=[],u={name:"app",components:{},methods:{rollback:function(){}}},d=u,h=(n("5c0b"),n("2877")),f=Object(h["a"])(d,l,c,!1,null,null,null),p=f.exports,m=n("8c4f"),v=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{attrs:{id:"home"}},[n("transition",{attrs:{name:"slide-fade",mode:"out-in"}},[n("router-view")],1)],1)},b=[],g={name:"home",components:{}},x=g,A=(n("02b7"),Object(h["a"])(x,v,b,!1,null,"1e46593c",null)),y=A.exports,C=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"index"},[a("img",{attrs:{src:n("c338"),alt:""}}),a("van-loading")],1)},k=[],w={name:"index",props:{msg:String},mounted:function(){this.isLogin()},methods:{isLogin:function(){var t=this;this.$axios({method:"get",url:"api/isLogin"}).then(function(e){1==e.data.code?t.$router.push("/home"):t.$router.push("/login")})}}},P=w,Y=(n("40d2"),Object(h["a"])(P,C,k,!1,null,"83922986",null)),O=Y.exports,T=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"login"},[n("van-image",{staticClass:"img",attrs:{round:"",fit:"cover",width:"5rem",height:"5rem",src:"https://img.yzcdn.cn/vant/cat.jpeg"}}),n("van-cell-group",[n("van-field",{attrs:{label:"用户名:",autosize:"",placeholder:"请输入用户名"},model:{value:t.username,callback:function(e){t.username=e},expression:"username"}})],1),n("van-cell-group",[n("van-field",{attrs:{label:"密　码:",type:"password",autosize:"",placeholder:"请输入密码"},model:{value:t.password,callback:function(e){t.password=e},expression:"password"}})],1),n("div",{staticClass:"jz"},[n("van-checkbox",{attrs:{"checked-color":"#07c160"},model:{value:t.rememberme,callback:function(e){t.rememberme=e},expression:"rememberme"}},[t._v("记住登录")])],1),n("div",{staticClass:"but"},[n("van-button",{attrs:{size:"large",color:"rgb(26, 96, 226)"},on:{click:function(e){return t.login()}}},[t._v("登录")])],1)],1)},S=[],j={name:"login",data:function(){return{username:"",password:"",rememberme:!1}},props:{msg:String},methods:{login:function(){var t=this;this.$axios({method:"post",url:"api/login",data:{username:this.username,password:this.password,rememberme:this.rememberme}}).then(function(e){1==e.data.code?t.toHome():t.$toast(e.data.msg)})}}},F=j,L=(n("f937"),Object(h["a"])(F,T,S,!1,null,"44ae83af",null)),U=L.exports,M=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"mymain"},[n("van-nav-bar",{attrs:{title:"Home","right-text":"+　"},on:{"click-right":function(e){return t.toAdd()}}}),t.isNull?n("van-loading",{staticClass:"isnull"}):t._e(),n("van-pull-refresh",{staticClass:"mmmmm",on:{refresh:function(e){return t.getUserCode()}},model:{value:t.isLoading,callback:function(e){t.isLoading=e},expression:"isLoading"}},t._l(t.code,function(e,a){return n("div",{key:a},[n("van-swipe-cell",[n("van-cell",{attrs:{title:e.title,"is-link":""},on:{click:function(n){return t.toCodeDetails(e.id)}}}),n("template",{slot:"right"},[n("van-button",{attrs:{square:"",type:"danger",text:"删除"},on:{click:function(n){return t.del(e.id)}}})],1)],2),n("mylink")],1)}),0)],1)},Q=[],$={name:"mymain",data:function(){return{code:[],isLoading:!1}},computed:{isNull:function(){return 0==this.code.length}},props:{msg:String},mounted:function(){this.getUserCode()},methods:{del:function(t){var e=this;this.$axios({method:"get",url:"api/delCode",params:{id:t}}).then(function(t){1==t.data.code?(e.$notify({message:"删除成功！",duration:1e3,background:"#1989fa"}),e.getUserCode()):e.$notify(t.data.msg)})},getUserCode:function(){var t=this;this.isLoading=!0,this.$axios({method:"get",url:"api/getUserCode"}).then(function(e){t.isLoading=!1,1==e.data.code?t.code=e.data.data:(t.$router.push("/login"),t.$notify("你还没有登录！"))}).catch(function(e){t.isLoading=!1,t.$toast.fail(e+"")})},toAdd:function(){this.rollback.add("/home"),this.$router.push("home/add")},toCodeDetails:function(t){this.rollback.add("/home"),this.$router.push({path:"home/codeDetails",query:{id:t}})}}},z=$,q=(n("0cc2"),Object(h["a"])(z,M,Q,!1,null,"1b08e496",null)),W=q.exports,B=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"code"},[n("van-nav-bar",{attrs:{title:t.code.title,"left-arrow":""},on:{"click-left":function(e){return t.bacc()}}}),n("div",[n("van-cell",{attrs:{title:"标题",value:t.code.title}}),n("van-cell",{attrs:{title:"网址",value:t.code.url}}),n("van-cell",{attrs:{title:"用户名",value:t.code.username}}),n("van-cell",{attrs:{title:"密码",value:t.code.password}}),n("van-cell",{attrs:{title:"提示",value:t.code.hint}})],1),n("div",{staticClass:"but"},[n("van-button",{staticClass:"fz",attrs:{type:"primary",size:"large"},on:{click:function(e){return t.cllllll()}}},[t._v("复制密码")]),n("van-button",{staticClass:"xg",attrs:{size:"large"},on:{click:function(e){return t.toUpd(t.code.id)}}},[t._v("修改密码信息")])],1)],1)},G=[],J={name:"codeDetails",props:{msg:String},data:function(){return{id:1,code:{}}},mounted:function(){this.id=this.$route.query.id,void 0!=this.id?this.getCodeInfoByid(this.id):this.$router.push("/home")},methods:{toUpd:function(t){this.rollback.add("/home/codeDetails"),this.$router.push({path:"/home/upd",query:{id:t}})},cllllll:function(){var t=this;this.$copyText(this.code.password).then(function(e){t.$toast("已成功复制，可直接去粘贴")},function(e){t.$toast("复制失败")})},bacc:function(){var t=this.rollback.back();t&&this.$router.push(t)},getCodeInfoByid:function(t){var e=this;this.axios({method:"get",url:"api/getCodeInfoByid",params:{id:t}}).then(function(t){1==t.data.code?e.code=t.data.data:e.$toast(t.data.msg)}).catch(function(t){e.$toast.fail("服务器错误！"+t)})}}},K=J,X=(n("3912"),Object(h["a"])(K,B,G,!1,null,"232c1322",null)),N=X.exports,I=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"add"},[n("van-nav-bar",{attrs:{title:"添加一条新密码","left-arrow":""},on:{"click-left":function(e){return t.bacc()}}}),n("van-cell-group",[n("van-field",{attrs:{label:"标题",placeholder:"请输入标题",required:""},model:{value:t.title,callback:function(e){t.title=e},expression:"title"}}),n("van-field",{attrs:{label:"账号",placeholder:"请输入账号",required:""},model:{value:t.username,callback:function(e){t.username=e},expression:"username"}}),n("van-field",{attrs:{label:"密码",placeholder:"请输入密码",required:""},model:{value:t.password,callback:function(e){t.password=e},expression:"password"}}),n("van-field",{attrs:{label:"网址",placeholder:"请输入网址"},model:{value:t.url,callback:function(e){t.url=e},expression:"url"}}),n("van-field",{attrs:{label:"提示",placeholder:"请输入提示"},model:{value:t.hint,callback:function(e){t.hint=e},expression:"hint"}})],1),n("div",{staticClass:"but"},[n("van-button",{attrs:{type:"primary",size:"large"},on:{click:function(e){return t.addCode()}}},[t._v("提交信息")])],1)],1)},V=[],_={name:"add",data:function(){return{title:"",url:"",username:"",password:"",hint:""}},props:{msg:String},methods:{addCode:function(){var t=this;this.$axios({method:"post",url:"api/addCode",data:{title:this.title,url:this.url,username:this.username,password:this.password,hint:this.hint}}).then(function(e){t.$toast(e.data.msg)})}}},E=_,H=(n("b00c"),Object(h["a"])(E,I,V,!1,null,"6e5bcb36",null)),Z=H.exports,D=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"upd"},[n("van-nav-bar",{attrs:{title:"更新密码","left-arrow":""},on:{"click-left":function(e){return t.bacc()}}}),n("van-cell-group",[n("van-field",{attrs:{label:"标题",placeholder:"请输入标题",required:""},model:{value:t.title,callback:function(e){t.title=e},expression:"title"}}),n("van-field",{attrs:{label:"账号",placeholder:"请输入账号",required:""},model:{value:t.username,callback:function(e){t.username=e},expression:"username"}}),n("van-field",{attrs:{label:"密码",placeholder:"请输入密码",required:""},model:{value:t.password,callback:function(e){t.password=e},expression:"password"}}),n("van-field",{attrs:{label:"网址",placeholder:"请输入网址"},model:{value:t.url,callback:function(e){t.url=e},expression:"url"}}),n("van-field",{attrs:{label:"提示",placeholder:"请输入提示"},model:{value:t.hint,callback:function(e){t.hint=e},expression:"hint"}})],1),n("div",{staticClass:"but"},[n("van-button",{attrs:{type:"primary",size:"large"},on:{click:function(e){return t.updCode()}}},[t._v("提交信息")])],1)],1)},R=[],tt={name:"upd",data:function(){return{title:"",url:"",username:"",password:"",hint:"",id:""}},mounted:function(){this.id=this.$route.query.id,void 0!=this.id?this.getCodeinfo(this.id):(this.$toast("ID不正确！"),this.$router.push("/home"))},methods:{getCodeinfo:function(t){var e=this;this.$axios({method:"get",url:"api/getCodeInfoByid",params:{id:t}}).then(function(t){if(1==t.data.code){var n=t.data.data;e.title=n.title,e.url=n.url,e.username=n.username,e.password=n.password,e.hint=n.hint}else e.$toast(t.data.msg)}).catch(function(t){e.$toast("失败！"+t)})},updCode:function(){var t=this;this.$axios({method:"post",url:"api/updCode",data:{id:this.id,title:this.title,url:this.url,username:this.username,password:this.password,hint:this.hint}}).then(function(e){t.$toast(e.data.msg)})}}},et=tt,nt=(n("bb84"),Object(h["a"])(et,D,R,!1,null,"603f4623",null)),at=nt.exports;a["a"].use(m["a"]);var it=new m["a"]({routes:[{path:"/",name:"index",component:O},{path:"/login",name:"login",component:U},{path:"/home",name:"home",component:y,children:[{path:"/",component:W},{path:"codeDetails",component:N},{path:"add",component:Z},{path:"upd",component:at}]}]}),ot=n("4ae3"),rt=n.n(ot),st=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"mylink"})},lt=[],ct={name:"mylink"},ut=ct,dt=(n("69ac"),Object(h["a"])(ut,st,lt,!1,null,"777661a9",null)),ht=dt.exports,ft={install:function(t){t.component("mylink",ht)}},pt=ft,mt=n("b970");n("157a"),n("10df");a["a"].use(mt["a"]);var vt=n("b0b4"),bt=n("d225"),gt=function t(e){Object(bt["a"])(this,t),this.url=e},xt=function(){function t(){Object(bt["a"])(this,t)}return Object(vt["a"])(t,[{key:"add",value:function(t){var e=new gt(t);null!=this.head&&void 0!=this.head&&(this.head.last=e),e.next=this.head,this.head=e,e.last=this.head,this.length++,void 0==this.foot&&(this.foot=e),this.length>5&&(this.foot=this.foot.last,this.foot.next=void 0)}},{key:"back",value:function(){if(null!=this.head&&void 0!=this.head){var t=this.head;return this.head=this.head.next,this.length--,t.url}}}]),t}(),At=xt,yt=n("4eb5"),Ct=n.n(yt);a["a"].use(Ct.a),a["a"].prototype.rollback=new At,a["a"].config.productionTip=!1,a["a"].use(rt.a),a["a"].use(pt),new a["a"]({router:it,render:function(t){return t(p)}}).$mount("#app")},"5c0b":function(t,e,n){"use strict";var a=n("5e27"),i=n.n(a);i.a},"5e27":function(t,e,n){},"69ac":function(t,e,n){"use strict";var a=n("7d00"),i=n.n(a);i.a},"76cb":function(t,e,n){},"7d00":function(t,e,n){},"927a":function(t,e,n){},"99a6":function(t,e,n){},a308:function(t,e,n){},b00c:function(t,e,n){"use strict";var a=n("a308"),i=n.n(a);i.a},bb84:function(t,e,n){"use strict";var a=n("76cb"),i=n.n(a);i.a},c338:function(t,e){t.exports="data:image/png;base64,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"},cb67:function(t,e,n){},f0a3:function(t,e,n){},f937:function(t,e,n){"use strict";var a=n("f0a3"),i=n.n(a);i.a}});
//# sourceMappingURL=app.d29312ee.js.map