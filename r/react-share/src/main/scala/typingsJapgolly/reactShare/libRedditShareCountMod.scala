package typingsJapgolly.reactShare

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactShare.anon.OmitHTMLAttributesHTMLSpa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRedditShareCountMod {
  
  object default {
    
    inline def apply(props: OmitHTMLAttributesHTMLSpa): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-share/lib/RedditShareCount", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-share/lib/RedditShareCount", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
