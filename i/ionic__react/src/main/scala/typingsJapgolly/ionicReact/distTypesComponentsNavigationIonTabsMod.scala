package typingsJapgolly.ionicReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.ionicReact.anon.ComponentDidMount
import typingsJapgolly.ionicReact.distTypesComponentsNavigationIonTabsContextMod.IonTabsContextState
import typingsJapgolly.ionicReact.distTypesContextsNavContextMod.NavContextState
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsNavigationIonTabsMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
  @js.native
  open class IonTabs protected ()
    extends StObject
       with ComponentDidMount {
    def this(props: Props) = this()
  }
  object IonTabs {
    
    @JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs.contextType")
    @js.native
    val contextType: Context[NavContextState] = js.native
  }
  
  type ChildFunction = js.Function1[/* ionTabContext */ IonTabsContextState, Node]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocalJSX.IonTabs * / any */ trait Props extends StObject {
    
    var children: ChildFunction | Node
    
    var className: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ChildFunction | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* ionTabContext */ IonTabsContextState => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  object global {
    
    object JSX {
      
      trait IntrinsicElements extends StObject {
        
        var `ion-tabs`: Any
      }
      object IntrinsicElements {
        
        inline def apply(`ion-tabs`: Any): IntrinsicElements = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("ion-tabs")(`ion-tabs`.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
        
        extension [Self <: IntrinsicElements](x: Self) {
          
          inline def `setIon-tabs`(value: Any): Self = StObject.set(x, "ion-tabs", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
