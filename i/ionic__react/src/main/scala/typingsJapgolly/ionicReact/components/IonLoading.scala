package typingsJapgolly.ionicReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonLoadingElement
import typingsJapgolly.ionicReact.anon.`1`
import typingsJapgolly.ionicReact.distTypesComponentsCreateControllerComponentMod.ReactControllerProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoadingOptions * / scala.Any) & typingsJapgolly.ionicReact.distTypesComponentsCreateControllerComponentMod.ReactControllerProps & typingsJapgolly.ionicReact.anon.`1` & typingsJapgolly.react.mod.RefAttributes[typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonLoadingElement] because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoadingOptions * / scala.Any because couldn't resolve ClassTree.) */
object IonLoading {
  
  def apply(
    p: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoadingOptions */ Any) & ReactControllerProps & `1` & RefAttributes[HTMLIonLoadingElement]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@ionic/react", "IonLoading")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: IonLoading.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
