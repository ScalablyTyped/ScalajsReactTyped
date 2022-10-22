package typingsJapgolly.cathoQuantum

import typingsJapgolly.cathoQuantum.anon.Name
import typingsJapgolly.cathoQuantum.anon.`17`
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialsMod {
  
  @JSImport("@catho/quantum/Socials", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SocialsProps, js.Object, Any]
  
  type NonEmptyArray[T] = Array[T]
  
  type Socials = japgolly.scalajs.react.facade.React.Component[SocialsProps & js.Object, js.Object]
  
  trait SocialsProps extends StObject {
    
    var items: NonEmptyArray[Name]
    
    var size: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[`17`] = js.undefined
    
    var withBox: js.UndefOr[Boolean] = js.undefined
  }
  object SocialsProps {
    
    inline def apply(items: NonEmptyArray[Name]): SocialsProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialsProps]
    }
    
    extension [Self <: SocialsProps](x: Self) {
      
      inline def setItems(value: NonEmptyArray[Name]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: `17`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWithBox(value: Boolean): Self = StObject.set(x, "withBox", value.asInstanceOf[js.Any])
      
      inline def setWithBoxUndefined: Self = StObject.set(x, "withBox", js.undefined)
    }
  }
}
