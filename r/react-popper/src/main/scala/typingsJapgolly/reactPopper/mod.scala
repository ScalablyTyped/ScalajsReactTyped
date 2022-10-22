package typingsJapgolly.reactPopper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactPopper.anon.Attributes
import typingsJapgolly.reactPopper.anon.CreatePopper
import typingsJapgolly.reactPopper.anon.`0`
import typingsJapgolly.reactPopper.reactPopperStrings.modifiers
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-popper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-popper", "Manager")
  @js.native
  open class Manager protected ()
    extends Component[ManagerProps, js.Object, Any] {
    def this(props: ManagerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ManagerProps, context: Any) = this()
  }
  
  @JSImport("react-popper", "Popper")
  @js.native
  open class Popper[Modifiers] protected ()
    extends Component[PopperProps[Modifiers], js.Object, Any] {
    def this(props: PopperProps[Modifiers]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PopperProps[Modifiers], context: Any) = this()
  }
  
  @JSImport("react-popper", "Reference")
  @js.native
  open class Reference protected ()
    extends Component[ReferenceProps, js.Object, Any] {
    def this(props: ReferenceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReferenceProps, context: Any) = this()
  }
  
  inline def usePopper[Modifiers](): Attributes = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")().asInstanceOf[Attributes]
  inline def usePopper[Modifiers](referenceElement: Element): Attributes = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any]).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](referenceElement: Element, popperElement: HTMLElement): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.VirtualElement */ Any
  ): Attributes = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any]).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.VirtualElement */ Any,
    popperElement: HTMLElement
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](referenceElement: Null, popperElement: HTMLElement): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](referenceElement: Unit, popperElement: HTMLElement): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  
  inline def usePopper_modifiers[Modifiers](
    referenceElement: Element,
    popperElement: HTMLElement,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: Element,
    popperElement: Null,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: Element,
    popperElement: Unit,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.VirtualElement */ Any,
    popperElement: HTMLElement,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.VirtualElement */ Any,
    popperElement: Null,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.VirtualElement */ Any,
    popperElement: Unit,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: Null,
    popperElement: HTMLElement,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: Null,
    popperElement: Null,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: Null,
    popperElement: Unit,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: Unit,
    popperElement: HTMLElement,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: Unit,
    popperElement: Null,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper_modifiers[Modifiers](
    referenceElement: Unit,
    popperElement: Unit,
    options: (Omit[
      Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Options */ Any
      ], 
      modifiers
    ]) & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  
  trait ManagerProps extends StObject {
    
    var children: Node
  }
  object ManagerProps {
    
    inline def apply(): ManagerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ManagerProps]
    }
    
    extension [Self <: ManagerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Name extends react-popper.react-popper.StrictModifierNames ? react-popper.react-popper.StrictModifier<Name> : std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Modifier<Name, Options> * / any>
    }}}
    */
  @js.native
  trait Modifier[Name, Options /* <: js.Object */] extends StObject
  
  trait PopperArrowProps extends StObject {
    
    var ref: Ref[Any]
    
    var style: CSSProperties
  }
  object PopperArrowProps {
    
    inline def apply(style: CSSProperties): PopperArrowProps = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[PopperArrowProps]
    }
    
    extension [Self <: PopperArrowProps](x: Self) {
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopperChildrenProps extends StObject {
    
    var arrowProps: PopperArrowProps
    
    def forceUpdate(): Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
      ]
    
    var hasPopperEscaped: js.UndefOr[Boolean] = js.undefined
    
    var isReferenceHidden: js.UndefOr[Boolean] = js.undefined
    
    var placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any
    
    var ref: Ref[Any]
    
    var style: CSSProperties
    
    def update(): js.Promise[
        Null | (Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
        ])
      ]
  }
  object PopperChildrenProps {
    
    inline def apply(
      arrowProps: PopperArrowProps,
      forceUpdate: CallbackTo[
          Partial[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
          ]
        ],
      placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any,
      style: CSSProperties,
      update: CallbackTo[
          js.Promise[
            Null | (Partial[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
            ])
          ]
        ]
    ): PopperChildrenProps = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], forceUpdate = forceUpdate.toJsFn, placement = placement.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], update = update.toJsFn, ref = null)
      __obj.asInstanceOf[PopperChildrenProps]
    }
    
    extension [Self <: PopperChildrenProps](x: Self) {
      
      inline def setArrowProps(value: PopperArrowProps): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      inline def setForceUpdate(
        value: CallbackTo[
              Partial[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
              ]
            ]
      ): Self = StObject.set(x, "forceUpdate", value.toJsFn)
      
      inline def setHasPopperEscaped(value: Boolean): Self = StObject.set(x, "hasPopperEscaped", value.asInstanceOf[js.Any])
      
      inline def setHasPopperEscapedUndefined: Self = StObject.set(x, "hasPopperEscaped", js.undefined)
      
      inline def setIsReferenceHidden(value: Boolean): Self = StObject.set(x, "isReferenceHidden", value.asInstanceOf[js.Any])
      
      inline def setIsReferenceHiddenUndefined: Self = StObject.set(x, "isReferenceHidden", js.undefined)
      
      inline def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setUpdate(
        value: CallbackTo[
              js.Promise[
                Null | (Partial[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
                ])
              ]
            ]
      ): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
  
  trait PopperProps[Modifiers] extends StObject {
    
    def children(props: PopperChildrenProps): Node
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var modifiers: js.UndefOr[js.Array[Modifier[Modifiers, js.Object]]] = js.undefined
    
    var onFirstUpdate: js.UndefOr[
        js.Function1[
          /* state */ Partial[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
          ], 
          Unit
        ]
      ] = js.undefined
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any
      ] = js.undefined
    
    var referenceElement: js.UndefOr[
        HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.VirtualElement */ Any)
      ] = js.undefined
    
    var strategy: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.PositioningStrategy */ Any
      ] = js.undefined
  }
  object PopperProps {
    
    inline def apply[Modifiers](children: PopperChildrenProps => Node): PopperProps[Modifiers] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PopperProps[Modifiers]]
    }
    
    extension [Self <: PopperProps[?], Modifiers](x: Self & PopperProps[Modifiers]) {
      
      inline def setChildren(value: PopperChildrenProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setModifiers(value: js.Array[Modifier[Modifiers, js.Object]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: (Modifier[Modifiers, js.Object])*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setOnFirstUpdate(
        value: /* state */ Partial[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
            ] => Callback
      ): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1((t0: /* state */ Partial[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
            ]) => value(t0).runNow()))
      
      inline def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
      
      inline def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setReferenceElement(
        value: HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.VirtualElement */ Any)
      ): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
      
      inline def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
      
      inline def setStrategy(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.PositioningStrategy */ Any
      ): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  type RefHandler = js.Function1[/* ref */ HTMLElement | Null, Unit]
  
  trait ReferenceChildrenProps extends StObject {
    
    // React refs are supposed to be contravariant (allows a more general type to be passed rather than a more specific one)
    // However, Typescript currently can't infer that fact for refs
    // See https://github.com/microsoft/TypeScript/issues/30748 for more information
    var ref: Ref[Any]
  }
  object ReferenceChildrenProps {
    
    inline def apply(): ReferenceChildrenProps = {
      val __obj = js.Dynamic.literal(ref = null)
      __obj.asInstanceOf[ReferenceChildrenProps]
    }
    
    extension [Self <: ReferenceChildrenProps](x: Self) {
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  trait ReferenceProps extends StObject {
    
    def children(props: ReferenceChildrenProps): Node
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
  }
  object ReferenceProps {
    
    inline def apply(children: ReferenceChildrenProps => Node): ReferenceProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ReferenceProps]
    }
    
    extension [Self <: ReferenceProps](x: Self) {
      
      inline def setChildren(value: ReferenceChildrenProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
  
  type StrictModifier[Name /* <: StrictModifierNames */] = UnionWhere[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.StrictModifiers */ Any, 
    `0`[Name]
  ]
  
  type StrictModifierNames = NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.StrictModifiers * / any['name'] */ js.Any
  ]
  
  // Utility type
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    U extends M ? U : never
    }}}
    */
  @js.native
  trait UnionWhere[U, M] extends StObject
}
