package typingsJapgolly.reactIntl

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormatSingularUnit
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcComponentsRelativeMod extends Shortcut {
  
  @JSImport("react-intl/lib/src/components/relative", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatRelativeTimeOptions * / any */ trait Props extends StObject {
    
    var children: js.UndefOr[js.Function1[/* value */ String, Element | Null]] = js.undefined
    
    var unit: js.UndefOr[RelativeTimeFormatSingularUnit] = js.undefined
    
    var updateIntervalInSeconds: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: /* value */ String => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setUnit(value: RelativeTimeFormatSingularUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setUpdateIntervalInSeconds(value: Double): Self = StObject.set(x, "updateIntervalInSeconds", value.asInstanceOf[js.Any])
      
      inline def setUpdateIntervalInSecondsUndefined: Self = StObject.set(x, "updateIntervalInSeconds", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `libSrcComponentsRelativeMod.foo` */
  override def _to: FC[Props] = default
}
