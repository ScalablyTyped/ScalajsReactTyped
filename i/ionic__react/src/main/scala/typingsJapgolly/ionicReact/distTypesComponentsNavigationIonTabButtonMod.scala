package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTabButtonElement
import typingsJapgolly.ionicReact.anon.ComponentDidCatch
import typingsJapgolly.ionicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typingsJapgolly.ionicReact.distTypesModelsRouterOptionsMod.RouterOptions
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsNavigationIonTabButtonMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ionic/react/dist/types/components/navigation/IonTabButton", "IonTabButton")
  @js.native
  open class IonTabButton protected ()
    extends StObject
       with ComponentDidCatch {
    def this(props: Props) = this()
  }
  object IonTabButton {
    
    @JSImport("@ionic/react/dist/types/components/navigation/IonTabButton", "IonTabButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/react/dist/types/components/navigation/IonTabButton", "IonTabButton.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/react/dist/types/components/navigation/IonTabButton", "IonTabButton.displayName")
    @js.native
    val displayName: String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocalJSX.IonTabButton * / any */ trait Props
    extends StObject
       with IonicReactProps {
    
    var onClick: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLIonTabButtonElement]] = js.undefined
    
    var routerOptions: js.UndefOr[RouterOptions] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnClick(value: /* e */ Any => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRef(value: Ref[HTMLIonTabButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLIonTabButtonElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLIonTabButtonElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRouterOptions(value: RouterOptions): Self = StObject.set(x, "routerOptions", value.asInstanceOf[js.Any])
      
      inline def setRouterOptionsUndefined: Self = StObject.set(x, "routerOptions", js.undefined)
    }
  }
}
