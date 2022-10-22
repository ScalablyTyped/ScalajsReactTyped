package typingsJapgolly.wepy

import typingsJapgolly.wepy.appMod.AppConfig
import typingsJapgolly.wepy.appMod.AppConstructor
import typingsJapgolly.wepy.pageMod.PageConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  object default {
    
    @JSImport("wepy/base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wepy/base", "default.$createApp")
    @js.native
    def createApp: js.UndefOr[
        js.Function2[
          /* appClass */ AppConstructor, 
          /* appConfig */ AppConfig, 
          typingsJapgolly.wepy.appMod.default
        ]
      ] = js.native
    
    inline def createApp_=(
      x: js.UndefOr[
          js.Function2[
            /* appClass */ AppConstructor, 
            /* appConfig */ AppConfig, 
            typingsJapgolly.wepy.appMod.default
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$createApp")(x.asInstanceOf[js.Any])
    
    @JSImport("wepy/base", "default.$createPage")
    @js.native
    def createPage: js.UndefOr[
        js.Function2[
          /* pageClass */ PageConstructor, 
          /* pagePath */ String | Boolean, 
          typingsJapgolly.wepy.pageMod.default
        ]
      ] = js.native
    
    inline def createPage_=(
      x: js.UndefOr[
          js.Function2[
            /* pageClass */ PageConstructor, 
            /* pagePath */ String | Boolean, 
            typingsJapgolly.wepy.pageMod.default
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$createPage")(x.asInstanceOf[js.Any])
  }
}
