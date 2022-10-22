package typingsJapgolly.reactMdLink

import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSkipToMainContentMod {
  
  @JSImport("@react-md/link/types/SkipToMainContent", "SkipToMainContent")
  @js.native
  val SkipToMainContent: ForwardRefExoticComponent[SkipToMainContentProps & RefAttributes[HTMLAnchorElement]] = js.native
  
  trait SkipToMainContentProps
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    /**
      * The id to use for the `<main>` content that should be focused once this
      * link is clicked.
      */
    var mainId: String
    
    /**
      * Boolean if the skip to main content link should be unstyled so that you can
      * provide your own styles. This is just helpful if you are using this
      * component in a multiple places and don't want to keep overriding the
      * default styles each time.
      *
      * Note: there will still be the "base" link styles, font size, and z-index.
      * The `$rmd-link-skip-styles` and `$rmd-link-skip-active-styles` will not be
      * applied.
      */
    var unstyled: js.UndefOr[Boolean] = js.undefined
  }
  object SkipToMainContentProps {
    
    inline def apply(mainId: String): SkipToMainContentProps = {
      val __obj = js.Dynamic.literal(mainId = mainId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkipToMainContentProps]
    }
    
    extension [Self <: SkipToMainContentProps](x: Self) {
      
      inline def setMainId(value: String): Self = StObject.set(x, "mainId", value.asInstanceOf[js.Any])
      
      inline def setUnstyled(value: Boolean): Self = StObject.set(x, "unstyled", value.asInstanceOf[js.Any])
      
      inline def setUnstyledUndefined: Self = StObject.set(x, "unstyled", js.undefined)
    }
  }
}
