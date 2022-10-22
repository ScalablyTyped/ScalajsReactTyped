package typingsJapgolly.reactOnclickoutside

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import typingsJapgolly.reactOnclickoutside.reactOnclickoutsideStrings.disableOnClickOutside
import typingsJapgolly.reactOnclickoutside.reactOnclickoutsideStrings.enableOnClickOutside
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-onclickoutside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](component: ComponentClassP[P & js.Object]): WrapperClass[P, ComponentClassP[P & js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[WrapperClass[P, ComponentClassP[P & js.Object]]]
  inline def default[P](component: ComponentClassP[P & js.Object], config: ConfigObject): WrapperClass[P, ComponentClassP[P & js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[WrapperClass[P, ComponentClassP[P & js.Object]]]
  inline def default[P](component: FunctionComponent[P]): WrapperClass[P, FunctionComponent[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[WrapperClass[P, FunctionComponent[P]]]
  inline def default[P](component: FunctionComponent[P], config: ConfigObject): WrapperClass[P, FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[WrapperClass[P, FunctionComponent[P]]]
  inline def default[P](component: ClickOutComponentClass[P]): WrapperClass[P, ClickOutComponentClass[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[WrapperClass[P, ClickOutComponentClass[P]]]
  inline def default[P](component: ClickOutComponentClass[P], config: ConfigObject): WrapperClass[P, ClickOutComponentClass[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[WrapperClass[P, ClickOutComponentClass[P]]]
  
  trait AdditionalProps
    extends StObject
       with ConfigObject {
    
    var disableOnClickOutside: js.UndefOr[Boolean] = js.undefined
    
    var eventTypes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var outsideClickIgnoreClass: js.UndefOr[String] = js.undefined
    
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    var stopPropagation: js.UndefOr[Boolean] = js.undefined
  }
  object AdditionalProps {
    
    inline def apply(): AdditionalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalProps]
    }
    
    extension [Self <: AdditionalProps](x: Self) {
      
      inline def setDisableOnClickOutside(value: Boolean): Self = StObject.set(x, "disableOnClickOutside", value.asInstanceOf[js.Any])
      
      inline def setDisableOnClickOutsideUndefined: Self = StObject.set(x, "disableOnClickOutside", js.undefined)
      
      inline def setEventTypes(value: String | js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
      
      inline def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
      
      inline def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value*))
      
      inline def setOutsideClickIgnoreClass(value: String): Self = StObject.set(x, "outsideClickIgnoreClass", value.asInstanceOf[js.Any])
      
      inline def setOutsideClickIgnoreClassUndefined: Self = StObject.set(x, "outsideClickIgnoreClass", js.undefined)
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    }
  }
  
  @js.native
  trait ClickOutComponentClass[P]
    extends StObject
       with ComponentClass[P, js.Object]
  
  type ComponentConstructor[P] = ComponentType[P]
  
  trait ConfigObject extends StObject {
    
    var excludeScrollbar: js.UndefOr[Boolean] = js.undefined
    
    var handleClickOutside: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  }
  object ConfigObject {
    
    inline def apply(): ConfigObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigObject]
    }
    
    extension [Self <: ConfigObject](x: Self) {
      
      inline def setExcludeScrollbar(value: Boolean): Self = StObject.set(x, "excludeScrollbar", value.asInstanceOf[js.Any])
      
      inline def setExcludeScrollbarUndefined: Self = StObject.set(x, "excludeScrollbar", js.undefined)
      
      inline def setHandleClickOutside(value: ReactMouseEventFrom[Any & Element] => Callback): Self = StObject.set(x, "handleClickOutside", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
      
      inline def setHandleClickOutsideUndefined: Self = StObject.set(x, "handleClickOutside", js.undefined)
    }
  }
  
  trait HandleClickOutside[T] extends StObject {
    
    var handleClickOutside: MouseEventHandler[T]
  }
  object HandleClickOutside {
    
    inline def apply[T](handleClickOutside: ReactMouseEventFrom[T & Element] => Callback): HandleClickOutside[T] = {
      val __obj = js.Dynamic.literal(handleClickOutside = js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => handleClickOutside(t0).runNow()))
      __obj.asInstanceOf[HandleClickOutside[T]]
    }
    
    extension [Self <: HandleClickOutside[?], T](x: Self & HandleClickOutside[T]) {
      
      inline def setHandleClickOutside(value: ReactMouseEventFrom[T & Element] => Callback): Self = StObject.set(x, "handleClickOutside", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & Element]) => value(t0).runNow()))
    }
  }
  
  trait InjectedOnClickOutProps extends StObject {
    
    def disableOnClickOutside(): Unit
    
    def enableOnClickOutside(): Unit
  }
  object InjectedOnClickOutProps {
    
    inline def apply(disableOnClickOutside: Callback, enableOnClickOutside: Callback): InjectedOnClickOutProps = {
      val __obj = js.Dynamic.literal(disableOnClickOutside = disableOnClickOutside.toJsFn, enableOnClickOutside = enableOnClickOutside.toJsFn)
      __obj.asInstanceOf[InjectedOnClickOutProps]
    }
    
    extension [Self <: InjectedOnClickOutProps](x: Self) {
      
      inline def setDisableOnClickOutside(value: Callback): Self = StObject.set(x, "disableOnClickOutside", value.toJsFn)
      
      inline def setEnableOnClickOutside(value: Callback): Self = StObject.set(x, "enableOnClickOutside", value.toJsFn)
    }
  }
  
  type OnClickOutProps[P] = WithoutInjectedClickOutProps[P] & AdditionalProps
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (props : infer P, context : any | undefined): react.react.ReactElement | null ? P : T extends new (props : infer P, context : any | undefined): react.react.Component<{}, {}, any> ? P : never
    }}}
    */
  @js.native
  trait PropsOf[T] extends StObject
  
  type WithoutInjectedClickOutProps[P] = Pick[
    P, 
    Exclude[
      /* keyof P */ String, 
      /* keyof react-onclickoutside.react-onclickoutside.InjectedOnClickOutProps */ disableOnClickOutside | enableOnClickOutside
    ]
  ]
  
  @js.native
  trait WrapperClass[P, C]
    extends StObject
       with Instantiable0[WrapperInstance[P, C]]
  
  @js.native
  trait WrapperInstance[P, C]
    extends Component[OnClickOutProps[LibraryManagedAttributes[C, P]], js.Object, Any] {
    
    def getInstance(): /* import warning: importer.ImportType#apply Failed type conversion: C extends {  contextType :react.react.Context<any> | undefined} & new <P = {}, S = {}, SS = any>(props : std.Readonly</ * import warning: RewrittenClass.unapply cls was tparam P * / any>): react.react.Component<P, S, SS> ? std.InstanceType<C> : never */ js.Any = js.native
  }
}
