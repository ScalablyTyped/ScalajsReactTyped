package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.NavComponent
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.NavComponentWithProps
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.NavOptions
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.TransitionDoneFn
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.NavOutlet
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import typingsJapgolly.ionicCore.mod.ViewController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsNavNavMod {
  
  @JSImport("@ionic/core/dist/types/components/nav/nav", "Nav")
  @js.native
  open class Nav ()
    extends StObject
       with NavOutlet {
    
    /**
      * If `true`, the nav should animate the transition of components.
      */
    var animated: Boolean = js.native
    
    /**
      * By default `ion-nav` animates transition between pages based in the mode (ios or material design).
      * However, this property allows to create custom transition using `AnimationBuilder` functions.
      */
    var animation: js.UndefOr[AnimationBuilder] = js.native
    
    /* private */ var animationEnabled: Any = js.native
    
    /**
      * Returns `true` if the current view can go back.
      *
      * @param view The view to check.
      */
    def canGoBack(): js.Promise[Boolean] = js.native
    def canGoBack(view: ViewController): js.Promise[Boolean] = js.native
    
    /* private */ var canGoBackSync: Any = js.native
    
    /* private */ var canStart: Any = js.native
    
    def componentDidLoad(): js.Promise[Unit] = js.native
    
    def componentWillLoad(): Unit = js.native
    
    def connectedCallback(): Unit = js.native
    
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    /* private */ var destroyView: Any = js.native
    
    /* private */ var destroyed: Any = js.native
    
    def disconnectedCallback(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var failed: Any = js.native
    
    /* private */ var fireError: Any = js.native
    
    /* private */ var gesture: Any = js.native
    
    /**
      * Get the active view.
      */
    def getActive(): js.Promise[js.UndefOr[ViewController]] = js.native
    
    /* private */ var getActiveSync: Any = js.native
    
    /**
      * Get the view at the specified index.
      *
      * @param index The index of the view.
      */
    def getByIndex(index: Double): js.Promise[js.UndefOr[ViewController]] = js.native
    
    /**
      * Returns the view that will be entered considering the transition instructions.
      *
      * @param ti The instructions.
      * @param leavingView The view being left or undefined if none.
      *
      * @returns The view that will be entered, undefined if none.
      */
    /* private */ var getEnteringView: Any = js.native
    
    def getLength(): Double = js.native
    
    /**
      * Get the previous view.
      *
      * @param view The view to get.
      */
    def getPrevious(): js.Promise[js.UndefOr[ViewController]] = js.native
    def getPrevious(view: ViewController): js.Promise[js.UndefOr[ViewController]] = js.native
    
    /* private */ var getPreviousSync: Any = js.native
    
    def insert(insertIndex: Double): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: String,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: String,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: ComponentProps[String]): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: String,
      componentProps: ComponentProps[String],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: String,
      componentProps: ComponentProps[String],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: ComponentProps[String], opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: String,
      componentProps: ComponentProps[String],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    /**
      * Inserts a component into the navigation stack at the specified index.
      * This is useful to add a component at any point in the navigation stack.
      *
      * @param insertIndex The index to insert the component at in the stack.
      * @param component The component to insert into the navigation stack.
      * @param componentProps Any properties of the component.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def insert(insertIndex: Double, component: js.Function): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Null,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Null,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: js.Function, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Unit,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Unit,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: js.Function, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: js.Function, componentProps: ComponentProps[js.Function]): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: HTMLElement): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Null,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Null,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: HTMLElement, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Unit,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Unit,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: HTMLElement, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: HTMLElement, componentProps: ComponentProps[HTMLElement]): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: Null,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: Null,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: ComponentProps[Null]): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: Null,
      componentProps: ComponentProps[Null],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: Null,
      componentProps: ComponentProps[Null],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: ComponentProps[Null], opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: Null,
      componentProps: ComponentProps[Null],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController]
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    
    /**
      * Inserts an array of components into the navigation stack at the specified index.
      * The last component in the array will become instantiated as a view, and animate
      * in to become the active view.
      *
      * @param insertIndex The index to insert the components at in the stack.
      * @param insertComponents The components to insert into the navigation stack.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def insertPages(insertIndex: Double, insertComponents: js.Array[NavComponent | NavComponentWithProps[Any]]): js.Promise[Boolean] = js.native
    def insertPages(
      insertIndex: Double,
      insertComponents: js.Array[NavComponent | NavComponentWithProps[Any]],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insertPages(
      insertIndex: Double,
      insertComponents: js.Array[NavComponent | NavComponentWithProps[Any]],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insertPages(
      insertIndex: Double,
      insertComponents: js.Array[NavComponent | NavComponentWithProps[Any]],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insertPages(
      insertIndex: Double,
      insertComponents: js.Array[NavComponent | NavComponentWithProps[Any]],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    
    /**
      * Inserts a view at the specified index.
      *
      * When the view already is in the stack it will be moved to the new position.
      *
      * @param view The view to insert.
      * @param index The index where to insert the view.
      */
    /* private */ var insertViewAt: Any = js.native
    
    /**
      * Event fired when the nav has changed components
      */
    var ionNavDidChange: EventEmitter[Unit] = js.native
    
    /**
      * Event fired when the nav will change components
      */
    var ionNavWillChange: EventEmitter[Unit] = js.native
    
    /**
      * Event fired when Nav will load a component
      * @internal
      */
    var ionNavWillLoad: EventEmitter[Unit] = js.native
    
    /* private */ var isTransitioning: Any = js.native
    
    /**
      * Consumes the next transition in the queue.
      *
      * @returns whether the transition is executed.
      */
    /* private */ var nextTrns: Any = js.native
    
    /* private */ var onEnd: Any = js.native
    
    /* private */ var onMove: Any = js.native
    
    /* private */ var onStart: Any = js.native
    
    /**
      * Pop a component off of the navigation stack. Navigates back from the current
      * component.
      *
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def pop(): js.Promise[Boolean] = js.native
    def pop(opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def pop(opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def pop(opts: NavOptions): js.Promise[Boolean] = js.native
    def pop(opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    
    /**
      * Pop to a specific index in the navigation stack.
      *
      * @param indexOrViewCtrl The index or view controller to pop to.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def popTo(indexOrViewCtrl: Double): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: Double, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: Double, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: Double, opts: NavOptions): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: Double, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: ViewController): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: ViewController, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: ViewController, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: ViewController, opts: NavOptions): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: ViewController, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    
    /**
      * Navigate back to the root of the stack, no matter how far back that is.
      *
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def popToRoot(): js.Promise[Boolean] = js.native
    def popToRoot(opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popToRoot(opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popToRoot(opts: NavOptions): js.Promise[Boolean] = js.native
    def popToRoot(opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    
    /**
      * Adds and Removes the views from the navigation stack.
      *
      * @param enteringView The view being entered.
      * @param leavingView The view being left.
      * @param ti The instructions.
      */
    /* private */ var postViewInit: Any = js.native
    
    /* private */ var prepareTI: Any = js.native
    
    def push(): js.Promise[Boolean] = js.native
    def push(component: String): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: ComponentProps[String]): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: ComponentProps[String], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: ComponentProps[String], opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: ComponentProps[String], opts: NavOptions): js.Promise[Boolean] = js.native
    def push(
      component: String,
      componentProps: ComponentProps[String],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    /**
      * Push a new component onto the current navigation stack. Pass any additional
      * information along as an object. This additional information is accessible
      * through NavParams.
      *
      * @param component The component to push onto the navigation stack.
      * @param componentProps Any properties of the component.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def push(component: js.Function): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: ComponentProps[js.Function]): js.Promise[Boolean] = js.native
    def push(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: ComponentProps[js.Function], opts: NavOptions): js.Promise[Boolean] = js.native
    def push(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(component: HTMLElement): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: ComponentProps[HTMLElement]): js.Promise[Boolean] = js.native
    def push(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: ComponentProps[HTMLElement], opts: NavOptions): js.Promise[Boolean] = js.native
    def push(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: ComponentProps[Null]): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: ComponentProps[Null], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: ComponentProps[Null], opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: ComponentProps[Null], opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: ComponentProps[Null], opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController]
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def push(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    
    /**
      * Adds a navigation stack change to the queue and schedules it to run.
      *
      * @returns Whether the transition succeeds.
      */
    /* private */ var queueTrns: Any = js.native
    
    /**
      * Removes a component from the navigation stack at the specified index.
      *
      * @param startIndex The number to begin removal at.
      * @param removeCount The number of components to remove.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def removeIndex(startIndex: Double): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Double): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Double, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Double, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Double, opts: NavOptions): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Double, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    
    /**
      * Removes a view from the stack.
      *
      * @param view The view to remove.
      */
    /* private */ var removeView: Any = js.native
    
    def render(): Any = js.native
    
    /**
      * Root NavComponent to load
      */
    var root: js.UndefOr[NavComponent] = js.native
    
    def rootChanged(): Unit = js.native
    
    /**
      * Any parameters for the root component
      */
    var rootParams: js.UndefOr[ComponentProps[Null]] = js.native
    
    /** Executes all the transition instruction from the queue. */
    /* private */ var runTransition: Any = js.native
    
    /* private */ var sbAni: Any = js.native
    
    /**
      * Set the views of the current navigation stack and navigate to the last view.
      * By default animations are disabled, but they can be enabled by passing options
      * to the navigation controller. Navigation parameters can also be passed to the
      * individual pages in the array.
      *
      * @param views The list of views to set as the navigation stack.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def setPages(views: js.Array[NavComponent | NavComponentWithProps[Any]]): js.Promise[Boolean] = js.native
    def setPages(views: js.Array[NavComponent | NavComponentWithProps[Any]], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setPages(views: js.Array[NavComponent | NavComponentWithProps[Any]], opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setPages(views: js.Array[NavComponent | NavComponentWithProps[Any]], opts: NavOptions): js.Promise[Boolean] = js.native
    def setPages(
      views: js.Array[NavComponent | NavComponentWithProps[Any]],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    
    def setRoot(): js.Promise[Boolean] = js.native
    def setRoot(component: String): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: ComponentProps[String]): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: ComponentProps[String], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: ComponentProps[String], opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: ComponentProps[String], opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(
      component: String,
      componentProps: ComponentProps[String],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    /**
      * Set the root for the current navigation stack to a component.
      *
      * @param component The component to set as the root of the navigation stack.
      * @param componentProps Any properties of the component.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def setRoot(component: js.Function): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: ComponentProps[js.Function]): js.Promise[Boolean] = js.native
    def setRoot(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: ComponentProps[js.Function], opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: ComponentProps[HTMLElement]): js.Promise[Boolean] = js.native
    def setRoot(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: ComponentProps[HTMLElement], opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: ComponentProps[Null]): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: ComponentProps[Null], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: ComponentProps[Null], opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: ComponentProps[Null], opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: ComponentProps[Null], opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController]
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController,
      componentProps: ComponentProps[typingsJapgolly.ionicCore.distTypesComponentsNavViewControllerMod.ViewController],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    
    /* private */ var success: Any = js.native
    
    /**
      * If the nav component should allow for swipe-to-go-back.
      */
    var swipeGesture: js.UndefOr[Boolean] = js.native
    
    def swipeGestureChanged(): Unit = js.native
    
    /* private */ var transInstr: Any = js.native
    
    /* private */ var transition: Any = js.native
    
    /* private */ var transitionFinish: Any = js.native
    
    /**
      * Unmounts all inactive views after the specified active view.
      *
      * DOM WRITE
      *
      * @param activeView The view that is actively visible in the stack. Used to calculate which views to unmount.
      */
    /* private */ var unmountInactiveViews: Any = js.native
    
    /* private */ var useRouter: Any = js.native
    
    /* private */ var views: Any = js.native
  }
}
