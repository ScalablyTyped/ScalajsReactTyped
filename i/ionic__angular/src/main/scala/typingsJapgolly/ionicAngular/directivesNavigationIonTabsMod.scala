package typingsJapgolly.ionicAngular

import org.scalajs.dom.CustomEvent
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.IonTabsDidChange
import typingsJapgolly.ionicAngular.anon.Tab
import typingsJapgolly.ionicAngular.diR3InjectorMod.EnvironmentInjector
import typingsJapgolly.ionicAngular.directivesNavigationIonRouterOutletMod.IonRouterOutlet
import typingsJapgolly.ionicAngular.directivesNavigationStackUtilsMod.StackEvent
import typingsJapgolly.ionicAngular.directivesProxiesMod.IonTabBar
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`[slotEqualssigntop]`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-tabs`
import typingsJapgolly.ionicAngular.ionicAngularStrings.tabBar
import typingsJapgolly.ionicAngular.providersNavControllerMod.NavController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesNavigationIonTabsMod {
  
  @JSImport("@ionic/angular/directives/navigation/ion-tabs", "IonTabs")
  @js.native
  open class IonTabs protected () extends StObject {
    def this(navCtrl: NavController) = this()
    
    /**
      * @experimental
      *
      * The `EnvironmentInjector` provider instance from the parent component.
      * Required for using standalone components with `ion-router-outlet`.
      *
      * Will be deprecated and removed when Angular 13 support is dropped.
      */
    var environmentInjector: EnvironmentInjector = js.native
    
    def getSelected(): js.UndefOr[String] = js.native
    
    var ionTabsDidChange: EventEmitter[Tab] = js.native
    
    var ionTabsWillChange: EventEmitter[Tab] = js.native
    
    /* private */ var navCtrl: Any = js.native
    
    /**
      * @internal
      */
    def onPageSelected(detail: StackEvent): Unit = js.native
    
    var outlet: IonRouterOutlet = js.native
    
    /**
      * When a tab button is clicked, there are several scenarios:
      * 1. If the selected tab is currently active (the tab button has been clicked
      *    again), then it should go to the root view for that tab.
      *
      *   a. Get the saved root view from the router outlet. If the saved root view
      *      matches the tabRootUrl, set the route view to this view including the
      *      navigation extras.
      *   b. If the saved root view from the router outlet does
      *      not match, navigate to the tabRootUrl. No navigation extras are
      *      included.
      *
      * 2. If the current tab tab is not currently selected, get the last route
      *    view from the router outlet.
      *
      *   a. If the last route view exists, navigate to that view including any
      *      navigation extras
      *   b. If the last route view doesn't exist, then navigate
      *      to the default tabRootUrl
      */
    def select(tabOrEvent: String): js.UndefOr[js.Promise[Boolean]] = js.native
    def select(tabOrEvent: CustomEvent): js.UndefOr[js.Promise[Boolean]] = js.native
    
    var tabBar: js.UndefOr[IonTabBar] = js.native
  }
  /* static members */
  object IonTabs {
    
    @JSImport("@ionic/angular/directives/navigation/ion-tabs", "IonTabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/navigation/ion-tabs", "IonTabs.\u0275cmp")
    @js.native
    def ɵcmp: ɵɵComponentDeclaration[
        IonTabs, 
        `ion-tabs`, 
        scala.Nothing, 
        typingsJapgolly.ionicAngular.anon.EnvironmentInjector, 
        IonTabsDidChange, 
        js.Array[tabBar], 
        js.Tuple2[`[slotEqualssigntop]`, Asterisk], 
        `false`
      ] = js.native
    inline def ɵcmp_=(
      x: ɵɵComponentDeclaration[
          IonTabs, 
          `ion-tabs`, 
          scala.Nothing, 
          typingsJapgolly.ionicAngular.anon.EnvironmentInjector, 
          IonTabsDidChange, 
          js.Array[tabBar], 
          js.Tuple2[`[slotEqualssigntop]`, Asterisk], 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/navigation/ion-tabs", "IonTabs.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[IonTabs, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonTabs, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}
