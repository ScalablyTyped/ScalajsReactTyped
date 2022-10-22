package typingsJapgolly.ionicReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTabBarElement
import typingsJapgolly.ionicReact.anon.OnIonTabsDidChange
import typingsJapgolly.ionicReact.anon.PickHTMLAttributesHTMLIonDefaultValue
import typingsJapgolly.ionicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocalJSX.IonTabBar * / scala.Any) & typingsJapgolly.ionicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps & typingsJapgolly.ionicReact.anon.OnIonTabsDidChange & typingsJapgolly.ionicReact.anon.PickHTMLAttributesHTMLIonDefaultValue & typingsJapgolly.react.mod.RefAttributes[typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTabBarElement] because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocalJSX.IonTabBar * / scala.Any because couldn't resolve ClassTree.) */
object IonTabBar {
  
  def apply(
    p: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocalJSX.IonTabBar */ Any) & IonicReactProps & OnIonTabsDidChange & PickHTMLAttributesHTMLIonDefaultValue & RefAttributes[HTMLIonTabBarElement]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@ionic/react", "IonTabBar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: IonTabBar.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
