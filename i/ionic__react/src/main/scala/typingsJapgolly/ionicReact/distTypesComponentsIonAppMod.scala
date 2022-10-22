package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAppElement
import typingsJapgolly.ionicReact.anon.AddOverlayCallback
import typingsJapgolly.ionicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsIonAppMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ionic/react/dist/types/components/IonApp", "IonApp")
  @js.native
  open class IonApp protected ()
    extends StObject
       with AddOverlayCallback {
    def this(props: Props) = this()
  }
  object IonApp {
    
    @JSImport("@ionic/react/dist/types/components/IonApp", "IonApp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/react/dist/types/components/IonApp", "IonApp.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/react/dist/types/components/IonApp", "IonApp.displayName")
    @js.native
    val displayName: String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocalJSX.IonApp * / any */ trait Props
    extends StObject
       with IonicReactProps {
    
    var ref: js.UndefOr[Ref[HTMLIonAppElement]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setRef(value: Ref[HTMLIonAppElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLIonAppElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLIonAppElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
