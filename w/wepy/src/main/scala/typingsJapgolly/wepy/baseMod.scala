package typingsJapgolly.wepy

import typingsJapgolly.wepy.appMod.AppConfig
import typingsJapgolly.wepy.appMod.AppConstructor
import typingsJapgolly.wepy.pageMod.PageConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wepy/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  @js.native
  object default extends js.Object {
    @JSName("$createApp")
    var $createApp: js.UndefOr[
        js.Function2[
          /* appClass */ AppConstructor, 
          /* appConfig */ AppConfig, 
          typingsJapgolly.wepy.appMod.default
        ]
      ] = js.native
    @JSName("$createPage")
    var $createPage: js.UndefOr[
        js.Function2[
          /* pageClass */ PageConstructor, 
          /* pagePath */ String | Boolean, 
          typingsJapgolly.wepy.pageMod.default
        ]
      ] = js.native
  }
  
}

