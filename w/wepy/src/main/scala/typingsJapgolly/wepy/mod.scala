package typingsJapgolly.wepy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.wepy.appMod.AppConfig
import typingsJapgolly.wepy.appMod.AppConstructor
import typingsJapgolly.wepy.pageMod.PageConstructor
import typingsJapgolly.wepy.wxEnhancedMod.WxEnhances
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wepy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait DefaultExport extends WxEnhances {
    @JSName("$copy")
    var $copy_Original: FnCall = js.native
    @JSName("$createApp")
    var $createApp_Original: js.Function2[
        /* appClass */ AppConstructor, 
        /* appConfig */ AppConfig, 
        typingsJapgolly.wepy.appMod.default
      ] = js.native
    @JSName("$createPage")
    var $createPage_Original: js.Function2[
        /* pageClass */ PageConstructor, 
        /* pagePath */ String | Boolean, 
        typingsJapgolly.wepy.pageMod.default
      ] = js.native
    @JSName("$extend")
    var $extend_Original: js.Function0[_] = js.native
    @JSName("$has")
    var $has_Original: js.Function2[/* obj */ js.Object, /* path */ String, Boolean] = js.native
    @JSName("$isDeepEqual")
    var $isDeepEqual_Original: js.Function4[
        /* a */ js.Any, 
        /* b */ js.Any, 
        /* aStack */ js.UndefOr[js.Array[_]], 
        /* bStack */ js.UndefOr[js.Array[_]], 
        Boolean
      ] = js.native
    @JSName("$isEmpty")
    var $isEmpty_Original: js.Function1[/* obj */ js.Object, Boolean] = js.native
    @JSName("$isEqual")
    var $isEqual_Original: js.Function4[
        /* a */ js.Any, 
        /* b */ js.Any, 
        /* aStack */ js.UndefOr[js.Array[_]], 
        /* bStack */ js.UndefOr[js.Array[_]], 
        Boolean
      ] = js.native
    @JSName("$isPlainObject")
    var $isPlainObject_Original: js.Function1[/* obj */ js.Any, Boolean] = js.native
    var app: App = js.native
    var component: Component = js.native
    var event: Event = js.native
    var mixin: Mixin = js.native
    var page: Page = js.native
    @JSName("$copy")
    def $copy[T](obj: T): T = js.native
    @JSName("$copy")
    def $copy[T](obj: T, deep: Boolean): T = js.native
    @JSName("$createApp")
    def $createApp(appClass: AppConstructor, appConfig: AppConfig): typingsJapgolly.wepy.appMod.default = js.native
    @JSName("$createPage")
    def $createPage(pageClass: PageConstructor, pagePath: String): typingsJapgolly.wepy.pageMod.default = js.native
    @JSName("$createPage")
    def $createPage(pageClass: PageConstructor, pagePath: Boolean): typingsJapgolly.wepy.pageMod.default = js.native
    @JSName("$extend")
    def $extend(): js.Any = js.native
    @JSName("$has")
    def $has(obj: js.Object, path: String): Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): Boolean = js.native
    @JSName("$isEmpty")
    def $isEmpty(obj: js.Object): Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): Boolean = js.native
    @JSName("$isPlainObject")
    def $isPlainObject(obj: js.Any): Boolean = js.native
  }
  
  val default: DefaultExport = js.native
  type App = Instantiable0[typingsJapgolly.wepy.appMod.default]
  type Component = Instantiable0[typingsJapgolly.wepy.componentMod.default]
  type Event = Instantiable3[
    /* name */ String, 
    /* source */ js.Any, 
    /* type */ js.Any, 
    typingsJapgolly.wepy.eventMod.default
  ]
  type Mixin = Instantiable0[typingsJapgolly.wepy.mixinMod.default]
  type Page = Instantiable0[typingsJapgolly.wepy.pageMod.default]
}

