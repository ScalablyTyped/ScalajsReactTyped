package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfSection extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfSection")
  @js.native
  val ^ : Constructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    def data(): Data
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(data: CallbackTo[Data], props: Props): Constructor = {
      val __obj = js.Dynamic.literal(data = data.toJsFn, props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setData(value: CallbackTo[Data]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var hasUnderlinedModifier: Boolean
  }
  object Data {
    
    inline def apply(hasUnderlinedModifier: Boolean): Data = {
      val __obj = js.Dynamic.literal(hasUnderlinedModifier = hasUnderlinedModifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setHasUnderlinedModifier(value: Boolean): Self = StObject.set(x, "hasUnderlinedModifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var levelHeading: Double
    
    var subtitleHeading: String
    
    var titleHeading: String
  }
  object Props {
    
    inline def apply(levelHeading: Double, subtitleHeading: String, titleHeading: String): Props = {
      val __obj = js.Dynamic.literal(levelHeading = levelHeading.asInstanceOf[js.Any], subtitleHeading = subtitleHeading.asInstanceOf[js.Any], titleHeading = titleHeading.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setLevelHeading(value: Double): Self = StObject.set(x, "levelHeading", value.asInstanceOf[js.Any])
      
      inline def setSubtitleHeading(value: String): Self = StObject.set(x, "subtitleHeading", value.asInstanceOf[js.Any])
      
      inline def setTitleHeading(value: String): Self = StObject.set(x, "titleHeading", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfSection.foo` */
  override def _to: Constructor = ^
}
