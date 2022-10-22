package typingsJapgolly.materialUiStyles

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeClassesMergeClassesMod {
  
  @JSImport("@material-ui/styles/mergeClasses/mergeClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Classes]
  inline def default(options: MergeClassesOption): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Classes]
  
  type Classes = StringDictionary[String]
  
  trait MergeClassesOption extends StObject {
    
    var Component: ElementType
    
    var baseClasses: Classes
    
    var newClasses: Classes
  }
  object MergeClassesOption {
    
    inline def apply(Component: ElementType, baseClasses: Classes, newClasses: Classes): MergeClassesOption = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], baseClasses = baseClasses.asInstanceOf[js.Any], newClasses = newClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeClassesOption]
    }
    
    extension [Self <: MergeClassesOption](x: Self) {
      
      inline def setBaseClasses(value: Classes): Self = StObject.set(x, "baseClasses", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: ElementType): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setNewClasses(value: Classes): Self = StObject.set(x, "newClasses", value.asInstanceOf[js.Any])
    }
  }
}
