package typingsJapgolly.mobx

import typingsJapgolly.mobx.anon.NewValueOldValue
import typingsJapgolly.mobx.anon.NewValueType
import typingsJapgolly.mobx.anon.ObservableKind
import typingsJapgolly.mobx.anon.OldValueType
import typingsJapgolly.mobx.distApiAnnotationMod.Annotation
import typingsJapgolly.mobx.distApiObservableMod.CreateObservableOptions
import typingsJapgolly.mobx.distCoreAtomMod.IAtom
import typingsJapgolly.mobx.distCoreComputedvalueMod.IComputedValueOptions
import typingsJapgolly.mobx.distInternalMod.ComputedValue
import typingsJapgolly.mobx.distInternalMod.ObservableValue
import typingsJapgolly.mobx.distTypesInterceptUtilsMod.IInterceptable
import typingsJapgolly.mobx.distTypesListenUtilsMod.IListenable
import typingsJapgolly.mobx.distTypesModifiersMod.IEnhancer
import typingsJapgolly.mobx.distUtilsUtilsMod.Lambda
import typingsJapgolly.mobx.mobxStrings.add
import typingsJapgolly.mobx.mobxStrings.update
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Map
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesObservableobjectMod {
  
  @JSImport("mobx/dist/types/observableobject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/types/observableobject", "ObservableObjectAdministration")
  @js.native
  open class ObservableObjectAdministration protected ()
    extends StObject
       with IInterceptable[IObjectWillChange[Any]]
       with IListenable {
    def this(
      target_ : Any,
      values_ : Map[PropertyKey, ObservableValue[Any] | ComputedValue[Any]],
      name_ : String
    ) = this()
    def this(
      target_ : Any,
      values_ : Map[PropertyKey, ObservableValue[Any] | ComputedValue[Any]],
      name_ : String,
      defaultAnnotation_ : Annotation
    ) = this()
    
    var appliedAnnotations_ : js.UndefOr[js.Object] = js.native
    
    var defaultAnnotation_ : Annotation = js.native
    
    def defineComputedProperty_(key: PropertyKey, options: IComputedValueOptions[Any]): Boolean | Null = js.native
    def defineComputedProperty_(key: PropertyKey, options: IComputedValueOptions[Any], proxyTrap: Boolean): Boolean | Null = js.native
    
    def defineObservableProperty_(key: PropertyKey, value: Any, enhancer: IEnhancer[Any]): Boolean | Null = js.native
    def defineObservableProperty_(key: PropertyKey, value: Any, enhancer: IEnhancer[Any], proxyTrap: Boolean): Boolean | Null = js.native
    
    /**
      * @param {PropertyKey} key
      * @param {PropertyDescriptor} descriptor
      * @param {boolean} proxyTrap whether it's called from proxy trap
      * @returns {boolean|null} true on success, false on failure (proxyTrap + non-configurable), null when cancelled by interceptor
      */
    def defineProperty_(key: PropertyKey, descriptor: js.PropertyDescriptor): Boolean | Null = js.native
    def defineProperty_(key: PropertyKey, descriptor: js.PropertyDescriptor, proxyTrap: Boolean): Boolean | Null = js.native
    
    /**
      * @param {PropertyKey} key
      * @param {PropertyDescriptor} descriptor
      * @param {boolean} proxyTrap whether it's called from proxy trap
      * @returns {boolean|null} true on success, false on failure (proxyTrap + non-configurable), null when cancelled by interceptor
      */
    def delete_(key: PropertyKey): Boolean | Null = js.native
    def delete_(key: PropertyKey, proxyTrap: Boolean): Boolean | Null = js.native
    
    def extend_(key: PropertyKey, descriptor: js.PropertyDescriptor, annotation: Boolean): Boolean | Null = js.native
    def extend_(key: PropertyKey, descriptor: js.PropertyDescriptor, annotation: Boolean, proxyTrap: Boolean): Boolean | Null = js.native
    /**
      * @param {PropertyKey} key
      * @param {PropertyDescriptor} descriptor
      * @param {Annotation|boolean} annotation true - use default annotation, false - copy as is
      * @param {boolean} proxyTrap whether it's called from proxy trap
      * @returns {boolean|null} true on success, false on failure (proxyTrap + non-configurable), null when cancelled by interceptor
      */
    def extend_(key: PropertyKey, descriptor: js.PropertyDescriptor, annotation: Annotation): Boolean | Null = js.native
    def extend_(key: PropertyKey, descriptor: js.PropertyDescriptor, annotation: Annotation, proxyTrap: Boolean): Boolean | Null = js.native
    
    def getObservablePropValue_(key: PropertyKey): Any = js.native
    
    def get_(key: PropertyKey): Any = js.native
    
    def has_(key: PropertyKey): Boolean = js.native
    
    def intercept_(handler: Any): Lambda = js.native
    
    var isPlainObject_ : Boolean = js.native
    
    var keysAtom_ : IAtom = js.native
    
    def keys_(): js.Array[PropertyKey] = js.native
    
    def make_(key: PropertyKey, annotation: Boolean): Unit = js.native
    /**
      * @param {PropertyKey} key
      * @param {Annotation|boolean} annotation true - use default annotation, false - ignore prop
      */
    def make_(key: PropertyKey, annotation: Annotation): Unit = js.native
    
    var name_ : String = js.native
    
    def notifyPropertyAddition_(key: PropertyKey, value: Any): Unit = js.native
    
    /**
      * Observes this object. Triggers for the events 'add', 'update' and 'delete'.
      * See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/observe
      * for callback details
      */
    def observe_(callback: js.Function1[/* changes */ IObjectDidChange[Any], Unit]): Lambda = js.native
    def observe_(callback: js.Function1[/* changes */ IObjectDidChange[Any], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def ownKeys_(): ArrayLike[String | js.Symbol] = js.native
    
    /* private */ var pendingKeys_ : Any = js.native
    
    var proxy_ : Any = js.native
    
    def setObservablePropValue_(key: PropertyKey, newValue: Any): Boolean | Null = js.native
    
    /**
      * @param {PropertyKey} key
      * @param {any} value
      * @param {Annotation|boolean} annotation true - use default annotation, false - copy as is
      * @param {boolean} proxyTrap whether it's called from proxy trap
      * @returns {boolean|null} true on success, false on failure (proxyTrap + non-configurable), null when cancelled by interceptor
      */
    def set_(key: PropertyKey, value: Any): Boolean | Null = js.native
    def set_(key: PropertyKey, value: Any, proxyTrap: Boolean): Boolean | Null = js.native
    
    var target_ : Any = js.native
    
    var values_ : Map[PropertyKey, ObservableValue[Any] | ComputedValue[Any]] = js.native
  }
  
  inline def asObservableObject(target: Any): IIsObservableObject = ^.asInstanceOf[js.Dynamic].applyDynamic("asObservableObject")(target.asInstanceOf[js.Any]).asInstanceOf[IIsObservableObject]
  inline def asObservableObject(target: Any, options: CreateObservableOptions): IIsObservableObject = (^.asInstanceOf[js.Dynamic].applyDynamic("asObservableObject")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IIsObservableObject]
  
  inline def isObservableObject(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableObject")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def recordAnnotationApplied(adm: ObservableObjectAdministration, annotation: Annotation, key: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recordAnnotationApplied")(adm.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IIsObservableObject extends StObject {
    
    @JSName("$mobx")
    var $mobx: ObservableObjectAdministration
  }
  object IIsObservableObject {
    
    inline def apply($mobx: ObservableObjectAdministration): IIsObservableObject = {
      val __obj = js.Dynamic.literal($mobx = $mobx.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIsObservableObject]
    }
    
    extension [Self <: IIsObservableObject](x: Self) {
      
      inline def set$mobx(value: ObservableObjectAdministration): Self = StObject.set(x, "$mobx", value.asInstanceOf[js.Any])
    }
  }
  
  type IObjectDidChange[T] = (NewValueType & ObservableKind[T]) | (NewValueOldValue & ObservableKind[T]) | (OldValueType & ObservableKind[T])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mobx.anon.NameNewValue[T]
    - typingsJapgolly.mobx.anon.NameObject[T]
  */
  trait IObjectWillChange[T] extends StObject
  object IObjectWillChange {
    
    inline def NameNewValue[T](name: PropertyKey, newValue: Any, `object`: T, `type`: update | add): typingsJapgolly.mobx.anon.NameNewValue[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.mobx.anon.NameNewValue[T]]
    }
    
    inline def NameObject[T](name: PropertyKey, `object`: T): typingsJapgolly.mobx.anon.NameObject[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove")
      __obj.asInstanceOf[typingsJapgolly.mobx.anon.NameObject[T]]
    }
  }
}
