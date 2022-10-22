package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.cathoQuantum.anon.`8`
import typingsJapgolly.cathoQuantum.cardContentMod.Content
import typingsJapgolly.cathoQuantum.cardDescriptionMod.Description
import typingsJapgolly.cathoQuantum.cardFooterMod.Footer
import typingsJapgolly.cathoQuantum.cardHeaderMod.Header
import typingsJapgolly.cathoQuantum.cardHeaderTextMod.HeaderText
import typingsJapgolly.cathoQuantum.cardMediaMod.Media
import typingsJapgolly.cathoQuantum.cardThumbnailMod.Thumbnail
import typingsJapgolly.cathoQuantum.cardTitleMod.Title
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("@catho/quantum/Card", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Card", "default.Content")
    @js.native
    def Content: typingsJapgolly.cathoQuantum.cardContentMod.Content = js.native
    inline def Content_=(x: Content): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Description")
    @js.native
    def Description: typingsJapgolly.cathoQuantum.cardDescriptionMod.Description = js.native
    inline def Description_=(x: Description): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Footer")
    @js.native
    def Footer: typingsJapgolly.cathoQuantum.cardFooterMod.Footer = js.native
    inline def Footer_=(x: Footer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Header")
    @js.native
    def Header: typingsJapgolly.cathoQuantum.cardHeaderMod.Header = js.native
    
    @JSImport("@catho/quantum/Card", "default.HeaderText")
    @js.native
    def HeaderText: typingsJapgolly.cathoQuantum.cardHeaderTextMod.HeaderText = js.native
    inline def HeaderText_=(x: HeaderText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderText")(x.asInstanceOf[js.Any])
    
    inline def Header_=(x: Header): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Media")
    @js.native
    def Media: typingsJapgolly.cathoQuantum.cardMediaMod.Media = js.native
    inline def Media_=(x: Media): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Media")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Thumbnail")
    @js.native
    def Thumbnail: typingsJapgolly.cathoQuantum.cardThumbnailMod.Thumbnail = js.native
    inline def Thumbnail_=(x: Thumbnail): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Thumbnail")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Title")
    @js.native
    def Title: typingsJapgolly.cathoQuantum.cardTitleMod.Title = js.native
    inline def Title_=(x: Title): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  }
  
  type Card = japgolly.scalajs.react.facade.React.Component[Props & js.Object, js.Object]
  
  trait Props extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Unit]] = js.undefined
    
    var theme: js.UndefOr[`8`] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnClick(value: /* e */ ReactMouseEventFrom[Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTheme(value: `8`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
