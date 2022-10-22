package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.anon.ClickButton
import typingsJapgolly.ionicReact.anon.Icon
import typingsJapgolly.ionicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typingsJapgolly.ionicReact.distTypesContextsNavContextMod.NavContextState
import typingsJapgolly.ionicReact.ionicReactStrings.icon
import typingsJapgolly.react.mod.Context
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsNavigationIonBackButtonMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", "IonBackButton")
  @js.native
  open class IonBackButton protected ()
    extends StObject
       with ClickButton {
    def this(props: Props) = this()
    def this(props: Props, context: Any) = this()
  }
  object IonBackButton {
    
    @JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", "IonBackButton.contextType")
    @js.native
    val contextType: Context[NavContextState] = js.native
    
    @JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", "IonBackButton.displayName")
    @js.native
    val displayName: String = js.native
  }
  
  type Props = (Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocalJSX.IonBackButton */ Any, 
    icon
  ]) & IonicReactProps & Icon
}
