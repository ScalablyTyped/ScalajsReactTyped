package typingsJapgolly.ionicReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonModalElement
import typingsJapgolly.ionicReact.anon.PickHTMLAttributesHTMLIon
import typingsJapgolly.ionicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IonModal * / scala.Any) & typingsJapgolly.ionicReact.anon.PickHTMLAttributesHTMLIon & typingsJapgolly.ionicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps & typingsJapgolly.react.mod.RefAttributes[typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonModalElement] because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IonModal * / scala.Any because couldn't resolve ClassTree.) */
object IonModal {
  
  def apply(
    p: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IonModal */ Any) & PickHTMLAttributesHTMLIon & IonicReactProps & RefAttributes[HTMLIonModalElement]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@ionic/react", "IonModal")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: IonModal.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
