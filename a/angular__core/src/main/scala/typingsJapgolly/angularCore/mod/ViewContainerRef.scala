package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/core", "ViewContainerRef")
@js.native
open class ViewContainerRef () extends StObject {
  
  /**
    * Destroys all views in this container.
    */
  def clear(): Unit = js.native
  
  /**
    * Instantiates a single component and inserts its host view into this container.
    *
    * @param componentFactory Component factory to use.
    * @param index The index at which to insert the new component's host view into this container.
    * If not specified, appends the new view as the last entry.
    * @param injector The injector to use as the parent for the new component.
    * @param projectableNodes List of DOM nodes that should be projected through
    *     [`<ng-content>`](api/core/ng-content) of the new component instance.
    * @param ngModuleRef An instance of the NgModuleRef that represent an NgModule.
    * This information is used to retrieve corresponding NgModule injector.
    *
    * @returns The new `ComponentRef` which contains the component instance and the host view.
    *
    * @deprecated Angular no longer requires component factories to dynamically create components.
    *     Use different signature of the `createComponent` method, which allows passing
    *     Component class directly.
    */
  def createComponent[C](componentFactory: ComponentFactory[C]): ComponentRef[C] = js.native
  def createComponent[C](componentFactory: ComponentFactory[C], index: Double): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Double,
    injector: Unit,
    projectableNodes: js.Array[js.Array[Any]]
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Double,
    injector: Unit,
    projectableNodes: js.Array[js.Array[Any]],
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Double,
    injector: Unit,
    projectableNodes: js.Array[js.Array[Any]],
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Double,
    injector: Unit,
    projectableNodes: Unit,
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Double,
    injector: Unit,
    projectableNodes: Unit,
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def createComponent[C](componentFactory: ComponentFactory[C], index: Double, injector: Injector): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Double,
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]]
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Double,
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]],
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Double,
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]],
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Double,
    injector: Injector,
    projectableNodes: Unit,
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Double,
    injector: Injector,
    projectableNodes: Unit,
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Unit,
    injector: Unit,
    projectableNodes: js.Array[js.Array[Any]]
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Unit,
    injector: Unit,
    projectableNodes: js.Array[js.Array[Any]],
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Unit,
    injector: Unit,
    projectableNodes: js.Array[js.Array[Any]],
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Unit,
    injector: Unit,
    projectableNodes: Unit,
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Unit,
    injector: Unit,
    projectableNodes: Unit,
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def createComponent[C](componentFactory: ComponentFactory[C], index: Unit, injector: Injector): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Unit,
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]]
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Unit,
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]],
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Unit,
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]],
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Unit,
    injector: Injector,
    projectableNodes: Unit,
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def createComponent[C](
    componentFactory: ComponentFactory[C],
    index: Unit,
    injector: Injector,
    projectableNodes: Unit,
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  /**
    * Instantiates a single component and inserts its host view into this container.
    *
    * @param componentType Component Type to use.
    * @param options An object that contains extra parameters:
    *  * index: the index at which to insert the new component's host view into this container.
    *           If not specified, appends the new view as the last entry.
    *  * injector: the injector to use as the parent for the new component.
    *  * ngModuleRef: an NgModuleRef of the component's NgModule, you should almost always provide
    *                 this to ensure that all expected providers are available for the component
    *                 instantiation.
    *  * environmentInjector: an EnvironmentInjector which will provide the component's environment.
    *                 you should almost always provide this to ensure that all expected providers
    *                 are available for the component instantiation. This option is intended to
    *                 replace the `ngModuleRef` parameter.
    *  * projectableNodes: list of DOM nodes that should be projected through
    *                      [`<ng-content>`](api/core/ng-content) of the new component instance.
    *
    * @returns The new `ComponentRef` which contains the component instance and the host view.
    */
  def createComponent[C](componentType: Type[C]): ComponentRef[C] = js.native
  def createComponent[C](componentType: Type[C], options: typingsJapgolly.angularCore.anon.EnvironmentInjector): ComponentRef[C] = js.native
  
  /**
    * Instantiates an embedded view and inserts it
    * into this container.
    * @param templateRef The HTML template that defines the view.
    * @param context The data-binding context of the embedded view, as declared
    * in the `<ng-template>` usage.
    * @param options Extra configuration for the created view. Includes:
    *  * index: The 0-based index at which to insert the new view into this container.
    *           If not specified, appends the new view as the last entry.
    *  * injector: Injector to be used within the embedded view.
    *
    * @returns The `ViewRef` instance for the newly created view.
    */
  def createEmbeddedView[C](templateRef: TemplateRef[C]): EmbeddedViewRef[C] = js.native
  def createEmbeddedView[C](templateRef: TemplateRef[C], context: C): EmbeddedViewRef[C] = js.native
  def createEmbeddedView[C](templateRef: TemplateRef[C], context: C, index: Double): EmbeddedViewRef[C] = js.native
  def createEmbeddedView[C](templateRef: TemplateRef[C], context: C, options: Index): EmbeddedViewRef[C] = js.native
  def createEmbeddedView[C](templateRef: TemplateRef[C], context: Unit, index: Double): EmbeddedViewRef[C] = js.native
  def createEmbeddedView[C](templateRef: TemplateRef[C], context: Unit, options: Index): EmbeddedViewRef[C] = js.native
  
  /**
    * Detaches a view from this container without destroying it.
    * Use along with `insert()` to move a view within the current container.
    * @param index The 0-based index of the view to detach.
    * If not specified, the last view in the container is detached.
    */
  def detach(): ViewRef | Null = js.native
  def detach(index: Double): ViewRef | Null = js.native
  
  /**
    * Anchor element that specifies the location of this container in the containing view.
    * Each view container can have only one anchor element, and each anchor element
    * can have only a single view container.
    *
    * Root elements of views attached to this container become siblings of the anchor element in
    * the rendered view.
    *
    * Access the `ViewContainerRef` of an element by placing a `Directive` injected
    * with `ViewContainerRef` on the element, or use a `ViewChild` query.
    *
    * <!-- TODO: rename to anchorElement -->
    */
  def element: ElementRef[Any] = js.native
  
  /**
    * Retrieves a view from this container.
    * @param index The 0-based index of the view to retrieve.
    * @returns The `ViewRef` instance, or null if the index is out of range.
    */
  def get(index: Double): ViewRef | Null = js.native
  
  /**
    * Returns the index of a view within the current container.
    * @param viewRef The view to query.
    * @returns The 0-based index of the view's position in this container,
    * or `-1` if this container doesn't contain the view.
    */
  def indexOf(viewRef: ViewRef): Double = js.native
  
  /**
    * The [dependency injector](guide/glossary#injector) for this view container.
    */
  def injector: Injector = js.native
  
  /**
    * Inserts a view into this container.
    * @param viewRef The view to insert.
    * @param index The 0-based index at which to insert the view.
    * If not specified, appends the new view as the last entry.
    * @returns The inserted `ViewRef` instance.
    *
    */
  def insert(viewRef: ViewRef): ViewRef = js.native
  def insert(viewRef: ViewRef, index: Double): ViewRef = js.native
  
  /**
    * Reports how many views are currently attached to this container.
    * @returns The number of views.
    */
  def length: Double = js.native
  
  /**
    * Moves a view to a new location in this container.
    * @param viewRef The view to move.
    * @param index The 0-based index of the new location.
    * @returns The moved `ViewRef` instance.
    */
  def move(viewRef: ViewRef, currentIndex: Double): ViewRef = js.native
  
  /** @deprecated No replacement */
  def parentInjector: Injector = js.native
  
  /**
    * Destroys a view attached to this container
    * @param index The 0-based index of the view to destroy.
    * If not specified, the last view in the container is removed.
    */
  def remove(): Unit = js.native
  def remove(index: Double): Unit = js.native
}
