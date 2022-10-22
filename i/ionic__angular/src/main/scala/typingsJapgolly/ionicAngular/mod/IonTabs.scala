package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.EnvironmentInjector
import typingsJapgolly.ionicAngular.anon.IonTabsDidChange
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`[slotEqualssigntop]`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-tabs`
import typingsJapgolly.ionicAngular.ionicAngularStrings.tabBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "IonTabs")
@js.native
open class IonTabs protected ()
  extends typingsJapgolly.ionicAngular.directivesNavigationIonTabsMod.IonTabs {
  def this(navCtrl: typingsJapgolly.ionicAngular.providersNavControllerMod.NavController) = this()
}
/* static members */
object IonTabs {
  
  @JSImport("@ionic/angular", "IonTabs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "IonTabs.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    typingsJapgolly.ionicAngular.directivesNavigationIonTabsMod.IonTabs, 
    `ion-tabs`, 
    scala.Nothing, 
    EnvironmentInjector, 
    IonTabsDidChange, 
    js.Array[tabBar], 
    js.Tuple2[`[slotEqualssigntop]`, Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      typingsJapgolly.ionicAngular.directivesNavigationIonTabsMod.IonTabs, 
      `ion-tabs`, 
      scala.Nothing, 
      EnvironmentInjector, 
      IonTabsDidChange, 
      js.Array[tabBar], 
      js.Tuple2[`[slotEqualssigntop]`, Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "IonTabs.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.directivesNavigationIonTabsMod.IonTabs, scala.Nothing] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.directivesNavigationIonTabsMod.IonTabs, scala.Nothing]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
