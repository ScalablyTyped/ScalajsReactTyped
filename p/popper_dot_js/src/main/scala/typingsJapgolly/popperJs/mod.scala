package typingsJapgolly.popperJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.popperJs.anon.Arrow
import typingsJapgolly.popperJs.anon.BaseModifierbehaviorBehav
import typingsJapgolly.popperJs.anon.BaseModifierelementstring
import typingsJapgolly.popperJs.anon.BaseModifiergpuAccelerati
import typingsJapgolly.popperJs.anon.BaseModifiernamestring
import typingsJapgolly.popperJs.anon.BaseModifieroffsetnumbers
import typingsJapgolly.popperJs.anon.BaseModifieronLoadFunctio
import typingsJapgolly.popperJs.anon.BaseModifierpriorityArray
import typingsJapgolly.popperJs.popperJsBooleans.`false`
import typingsJapgolly.popperJs.popperJsStrings._empty
import typingsJapgolly.std.ClientRect
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("popper.js", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Popper {
    def this(reference: Element, popper: Element) = this()
    def this(reference: ReferenceObject, popper: Element) = this()
    def this(reference: Element, popper: Element, options: PopperOptions) = this()
    def this(reference: ReferenceObject, popper: Element, options: PopperOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def disableEventListeners(): Unit = js.native
    
    /* CompleteClass */
    override def enableEventListeners(): Unit = js.native
    
    /* CompleteClass */
    var options: PopperOptions = js.native
    
    /* CompleteClass */
    var popper: Element = js.native
    
    /* CompleteClass */
    var reference: Element | ReferenceObject = js.native
    
    /* CompleteClass */
    override def scheduleUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
  }
  object default {
    
    @JSImport("popper.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("popper.js", "default.Defaults")
    @js.native
    def Defaults: PopperOptions = js.native
    inline def Defaults_=(x: PopperOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Defaults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("popper.js", "default.modifiers")
    @js.native
    def modifiers: js.Array[BaseModifiernamestring] = js.native
    inline def modifiers_=(x: js.Array[BaseModifiernamestring]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("popper.js", "default.placements")
    @js.native
    def placements: js.Array[Placement] = js.native
    inline def placements_=(x: js.Array[Placement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placements")(x.asInstanceOf[js.Any])
  }
  
  type BaseModifier = typingsJapgolly.popperJs.mod.Popper.BaseModifier
  
  type Behavior = typingsJapgolly.popperJs.mod.Popper.Behavior
  
  type Boundary = typingsJapgolly.popperJs.mod.Popper.Boundary
  
  type Data = typingsJapgolly.popperJs.mod.Popper.Data
  
  type ModifierFn = typingsJapgolly.popperJs.mod.Popper.ModifierFn
  
  type Modifiers = typingsJapgolly.popperJs.mod.Popper.Modifiers
  
  type Offset = typingsJapgolly.popperJs.mod.Popper.Offset
  
  type Padding = typingsJapgolly.popperJs.mod.Popper.Padding
  
  type Placement = typingsJapgolly.popperJs.mod.Popper.Placement
  
  trait Popper extends StObject {
    
    def destroy(): Unit
    
    def disableEventListeners(): Unit
    
    def enableEventListeners(): Unit
    
    var options: PopperOptions
    
    var popper: Element
    
    var reference: Element | ReferenceObject
    
    def scheduleUpdate(): Unit
    
    def update(): Unit
  }
  object Popper {
    
    inline def apply(
      destroy: Callback,
      disableEventListeners: Callback,
      enableEventListeners: Callback,
      options: typingsJapgolly.popperJs.mod.PopperOptions,
      popper: Element,
      reference: Element | typingsJapgolly.popperJs.mod.ReferenceObject,
      scheduleUpdate: Callback,
      update: Callback
    ): Popper = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, disableEventListeners = disableEventListeners.toJsFn, enableEventListeners = enableEventListeners.toJsFn, options = options.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], scheduleUpdate = scheduleUpdate.toJsFn, update = update.toJsFn)
      __obj.asInstanceOf[Popper]
    }
    
    trait Attributes extends StObject {
      
      var `x-out-of-boundaries`: _empty | `false`
      
      var `x-placement`: typingsJapgolly.popperJs.mod.Popper.Placement
    }
    object Attributes {
      
      inline def apply(
        `x-out-of-boundaries`: _empty | `false`,
        `x-placement`: typingsJapgolly.popperJs.mod.Popper.Placement
      ): Attributes = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("x-out-of-boundaries")(`x-out-of-boundaries`.asInstanceOf[js.Any])
        __obj.updateDynamic("x-placement")(`x-placement`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Attributes]
      }
      
      extension [Self <: Attributes](x: Self) {
        
        inline def `setX-out-of-boundaries`(value: _empty | `false`): Self = StObject.set(x, "x-out-of-boundaries", value.asInstanceOf[js.Any])
        
        inline def `setX-placement`(value: typingsJapgolly.popperJs.mod.Popper.Placement): Self = StObject.set(x, "x-placement", value.asInstanceOf[js.Any])
      }
    }
    
    trait BaseModifier extends StObject {
      
      var enabled: js.UndefOr[Boolean] = js.undefined
      
      var fn: js.UndefOr[typingsJapgolly.popperJs.mod.Popper.ModifierFn] = js.undefined
      
      var order: js.UndefOr[Double] = js.undefined
    }
    object BaseModifier {
      
      inline def apply(): typingsJapgolly.popperJs.mod.Popper.BaseModifier = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.popperJs.mod.Popper.BaseModifier]
      }
      
      extension [Self <: typingsJapgolly.popperJs.mod.Popper.BaseModifier](x: Self) {
        
        inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
        
        inline def setFn(
          value: (/* data */ typingsJapgolly.popperJs.mod.Popper.Data, /* options */ js.Object) => typingsJapgolly.popperJs.mod.Popper.Data
        ): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
        
        inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
        
        inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
        
        inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.popperJs.popperJsStrings.flip
      - typingsJapgolly.popperJs.popperJsStrings.clockwise
      - typingsJapgolly.popperJs.popperJsStrings.counterclockwise
    */
    trait Behavior extends StObject
    object Behavior {
      
      inline def clockwise: typingsJapgolly.popperJs.popperJsStrings.clockwise = "clockwise".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.clockwise]
      
      inline def counterclockwise: typingsJapgolly.popperJs.popperJsStrings.counterclockwise = "counterclockwise".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.counterclockwise]
      
      inline def flip: typingsJapgolly.popperJs.popperJsStrings.flip = "flip".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.flip]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.popperJs.popperJsStrings.scrollParent
      - typingsJapgolly.popperJs.popperJsStrings.viewport
      - typingsJapgolly.popperJs.popperJsStrings.window
    */
    trait Boundary extends StObject
    object Boundary {
      
      inline def scrollParent: typingsJapgolly.popperJs.popperJsStrings.scrollParent = "scrollParent".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.scrollParent]
      
      inline def viewport: typingsJapgolly.popperJs.popperJsStrings.viewport = "viewport".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.viewport]
      
      inline def window: typingsJapgolly.popperJs.popperJsStrings.window = "window".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.window]
    }
    
    trait Data extends StObject {
      
      var arrowElement: Element
      
      var arrowStyles: CSSStyleDeclaration
      
      var attributes: Attributes
      
      var boundaries: js.Object
      
      var flipped: Boolean
      
      var hide: Boolean
      
      var instance: Popper
      
      var offsets: Arrow
      
      var originalPlacement: typingsJapgolly.popperJs.mod.Popper.Placement
      
      var placement: typingsJapgolly.popperJs.mod.Popper.Placement
      
      var styles: CSSStyleDeclaration
    }
    object Data {
      
      inline def apply(
        arrowElement: Element,
        arrowStyles: CSSStyleDeclaration,
        attributes: Attributes,
        boundaries: js.Object,
        flipped: Boolean,
        hide: Boolean,
        instance: Popper,
        offsets: Arrow,
        originalPlacement: typingsJapgolly.popperJs.mod.Popper.Placement,
        placement: typingsJapgolly.popperJs.mod.Popper.Placement,
        styles: CSSStyleDeclaration
      ): typingsJapgolly.popperJs.mod.Popper.Data = {
        val __obj = js.Dynamic.literal(arrowElement = arrowElement.asInstanceOf[js.Any], arrowStyles = arrowStyles.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], flipped = flipped.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], originalPlacement = originalPlacement.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.popperJs.mod.Popper.Data]
      }
      
      extension [Self <: typingsJapgolly.popperJs.mod.Popper.Data](x: Self) {
        
        inline def setArrowElement(value: Element): Self = StObject.set(x, "arrowElement", value.asInstanceOf[js.Any])
        
        inline def setArrowStyles(value: CSSStyleDeclaration): Self = StObject.set(x, "arrowStyles", value.asInstanceOf[js.Any])
        
        inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        inline def setBoundaries(value: js.Object): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
        
        inline def setFlipped(value: Boolean): Self = StObject.set(x, "flipped", value.asInstanceOf[js.Any])
        
        inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setInstance(value: Popper): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
        
        inline def setOffsets(value: Arrow): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
        
        inline def setOriginalPlacement(value: typingsJapgolly.popperJs.mod.Popper.Placement): Self = StObject.set(x, "originalPlacement", value.asInstanceOf[js.Any])
        
        inline def setPlacement(value: typingsJapgolly.popperJs.mod.Popper.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setStyles(value: CSSStyleDeclaration): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      }
    }
    
    type ModifierFn = js.Function2[
        /* data */ typingsJapgolly.popperJs.mod.Popper.Data, 
        /* options */ js.Object, 
        typingsJapgolly.popperJs.mod.Popper.Data
      ]
    
    trait Modifiers
      extends StObject
         with /* name */ StringDictionary[
              js.UndefOr[typingsJapgolly.popperJs.mod.Popper.BaseModifier & (Record[String, Any])]
            ] {
      
      var applyStyle: js.UndefOr[BaseModifieronLoadFunctio] = js.undefined
      
      var arrow: js.UndefOr[BaseModifierelementstring] = js.undefined
      
      var computeStyle: js.UndefOr[BaseModifiergpuAccelerati] = js.undefined
      
      var flip: js.UndefOr[BaseModifierbehaviorBehav] = js.undefined
      
      var hide: js.UndefOr[typingsJapgolly.popperJs.mod.Popper.BaseModifier] = js.undefined
      
      var inner: js.UndefOr[typingsJapgolly.popperJs.mod.Popper.BaseModifier] = js.undefined
      
      var keepTogether: js.UndefOr[typingsJapgolly.popperJs.mod.Popper.BaseModifier] = js.undefined
      
      var offset: js.UndefOr[BaseModifieroffsetnumbers] = js.undefined
      
      var preventOverflow: js.UndefOr[BaseModifierpriorityArray] = js.undefined
      
      var shift: js.UndefOr[typingsJapgolly.popperJs.mod.Popper.BaseModifier] = js.undefined
    }
    object Modifiers {
      
      inline def apply(): typingsJapgolly.popperJs.mod.Popper.Modifiers = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.popperJs.mod.Popper.Modifiers]
      }
      
      extension [Self <: typingsJapgolly.popperJs.mod.Popper.Modifiers](x: Self) {
        
        inline def setApplyStyle(value: BaseModifieronLoadFunctio): Self = StObject.set(x, "applyStyle", value.asInstanceOf[js.Any])
        
        inline def setApplyStyleUndefined: Self = StObject.set(x, "applyStyle", js.undefined)
        
        inline def setArrow(value: BaseModifierelementstring): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
        
        inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
        
        inline def setComputeStyle(value: BaseModifiergpuAccelerati): Self = StObject.set(x, "computeStyle", value.asInstanceOf[js.Any])
        
        inline def setComputeStyleUndefined: Self = StObject.set(x, "computeStyle", js.undefined)
        
        inline def setFlip(value: BaseModifierbehaviorBehav): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
        
        inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
        
        inline def setHide(value: typingsJapgolly.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
        
        inline def setInner(value: typingsJapgolly.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
        
        inline def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
        
        inline def setKeepTogether(value: typingsJapgolly.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "keepTogether", value.asInstanceOf[js.Any])
        
        inline def setKeepTogetherUndefined: Self = StObject.set(x, "keepTogether", js.undefined)
        
        inline def setOffset(value: BaseModifieroffsetnumbers): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        inline def setPreventOverflow(value: BaseModifierpriorityArray): Self = StObject.set(x, "preventOverflow", value.asInstanceOf[js.Any])
        
        inline def setPreventOverflowUndefined: Self = StObject.set(x, "preventOverflow", js.undefined)
        
        inline def setShift(value: typingsJapgolly.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
        
        inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      }
    }
    
    trait Offset extends StObject {
      
      var height: Double
      
      var left: Double
      
      var top: Double
      
      var width: Double
    }
    object Offset {
      
      inline def apply(height: Double, left: Double, top: Double, width: Double): typingsJapgolly.popperJs.mod.Popper.Offset = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.popperJs.mod.Popper.Offset]
      }
      
      extension [Self <: typingsJapgolly.popperJs.mod.Popper.Offset](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    trait Padding extends StObject {
      
      var bottom: js.UndefOr[Double] = js.undefined
      
      var left: js.UndefOr[Double] = js.undefined
      
      var right: js.UndefOr[Double] = js.undefined
      
      var top: js.UndefOr[Double] = js.undefined
    }
    object Padding {
      
      inline def apply(): typingsJapgolly.popperJs.mod.Popper.Padding = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.popperJs.mod.Popper.Padding]
      }
      
      extension [Self <: typingsJapgolly.popperJs.mod.Popper.Padding](x: Self) {
        
        inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
        
        inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.popperJs.popperJsStrings.`auto-start`
      - typingsJapgolly.popperJs.popperJsStrings.auto
      - typingsJapgolly.popperJs.popperJsStrings.`auto-end`
      - typingsJapgolly.popperJs.popperJsStrings.`top-start`
      - typingsJapgolly.popperJs.popperJsStrings.top
      - typingsJapgolly.popperJs.popperJsStrings.`top-end`
      - typingsJapgolly.popperJs.popperJsStrings.`right-start`
      - typingsJapgolly.popperJs.popperJsStrings.right
      - typingsJapgolly.popperJs.popperJsStrings.`right-end`
      - typingsJapgolly.popperJs.popperJsStrings.`bottom-end`
      - typingsJapgolly.popperJs.popperJsStrings.bottom
      - typingsJapgolly.popperJs.popperJsStrings.`bottom-start`
      - typingsJapgolly.popperJs.popperJsStrings.`left-end`
      - typingsJapgolly.popperJs.popperJsStrings.left
      - typingsJapgolly.popperJs.popperJsStrings.`left-start`
    */
    trait Placement extends StObject
    object Placement {
      
      inline def auto: typingsJapgolly.popperJs.popperJsStrings.auto = "auto".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.auto]
      
      inline def `auto-end`: typingsJapgolly.popperJs.popperJsStrings.`auto-end` = "auto-end".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.`auto-end`]
      
      inline def `auto-start`: typingsJapgolly.popperJs.popperJsStrings.`auto-start` = "auto-start".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.`auto-start`]
      
      inline def bottom: typingsJapgolly.popperJs.popperJsStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.bottom]
      
      inline def `bottom-end`: typingsJapgolly.popperJs.popperJsStrings.`bottom-end` = "bottom-end".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.`bottom-end`]
      
      inline def `bottom-start`: typingsJapgolly.popperJs.popperJsStrings.`bottom-start` = "bottom-start".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.`bottom-start`]
      
      inline def left: typingsJapgolly.popperJs.popperJsStrings.left = "left".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.left]
      
      inline def `left-end`: typingsJapgolly.popperJs.popperJsStrings.`left-end` = "left-end".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.`left-end`]
      
      inline def `left-start`: typingsJapgolly.popperJs.popperJsStrings.`left-start` = "left-start".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.`left-start`]
      
      inline def right: typingsJapgolly.popperJs.popperJsStrings.right = "right".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.right]
      
      inline def `right-end`: typingsJapgolly.popperJs.popperJsStrings.`right-end` = "right-end".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.`right-end`]
      
      inline def `right-start`: typingsJapgolly.popperJs.popperJsStrings.`right-start` = "right-start".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.`right-start`]
      
      inline def top: typingsJapgolly.popperJs.popperJsStrings.top = "top".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.top]
      
      inline def `top-end`: typingsJapgolly.popperJs.popperJsStrings.`top-end` = "top-end".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.`top-end`]
      
      inline def `top-start`: typingsJapgolly.popperJs.popperJsStrings.`top-start` = "top-start".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.`top-start`]
    }
    
    extension [Self <: Popper](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisableEventListeners(value: Callback): Self = StObject.set(x, "disableEventListeners", value.toJsFn)
      
      inline def setEnableEventListeners(value: Callback): Self = StObject.set(x, "enableEventListeners", value.toJsFn)
      
      inline def setOptions(value: typingsJapgolly.popperJs.mod.PopperOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPopper(value: Element): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      inline def setReference(value: Element | typingsJapgolly.popperJs.mod.ReferenceObject): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setScheduleUpdate(value: Callback): Self = StObject.set(x, "scheduleUpdate", value.toJsFn)
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
    
    trait PopperOptions extends StObject {
      
      var eventsEnabled: js.UndefOr[Boolean] = js.undefined
      
      var modifiers: js.UndefOr[typingsJapgolly.popperJs.mod.Popper.Modifiers] = js.undefined
      
      var onCreate: js.UndefOr[js.Function1[/* data */ typingsJapgolly.popperJs.mod.Popper.Data, Unit]] = js.undefined
      
      var onUpdate: js.UndefOr[js.Function1[/* data */ typingsJapgolly.popperJs.mod.Popper.Data, Unit]] = js.undefined
      
      var placement: js.UndefOr[typingsJapgolly.popperJs.mod.Popper.Placement] = js.undefined
      
      var positionFixed: js.UndefOr[Boolean] = js.undefined
      
      var removeOnDestroy: js.UndefOr[Boolean] = js.undefined
    }
    object PopperOptions {
      
      inline def apply(): typingsJapgolly.popperJs.mod.Popper.PopperOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.popperJs.mod.Popper.PopperOptions]
      }
      
      extension [Self <: typingsJapgolly.popperJs.mod.Popper.PopperOptions](x: Self) {
        
        inline def setEventsEnabled(value: Boolean): Self = StObject.set(x, "eventsEnabled", value.asInstanceOf[js.Any])
        
        inline def setEventsEnabledUndefined: Self = StObject.set(x, "eventsEnabled", js.undefined)
        
        inline def setModifiers(value: typingsJapgolly.popperJs.mod.Popper.Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
        
        inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
        
        inline def setOnCreate(value: /* data */ typingsJapgolly.popperJs.mod.Popper.Data => Callback): Self = StObject.set(x, "onCreate", js.Any.fromFunction1((t0: /* data */ typingsJapgolly.popperJs.mod.Popper.Data) => value(t0).runNow()))
        
        inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
        
        inline def setOnUpdate(value: /* data */ typingsJapgolly.popperJs.mod.Popper.Data => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* data */ typingsJapgolly.popperJs.mod.Popper.Data) => value(t0).runNow()))
        
        inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
        
        inline def setPlacement(value: typingsJapgolly.popperJs.mod.Popper.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        inline def setPositionFixed(value: Boolean): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
        
        inline def setPositionFixedUndefined: Self = StObject.set(x, "positionFixed", js.undefined)
        
        inline def setRemoveOnDestroy(value: Boolean): Self = StObject.set(x, "removeOnDestroy", value.asInstanceOf[js.Any])
        
        inline def setRemoveOnDestroyUndefined: Self = StObject.set(x, "removeOnDestroy", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.popperJs.popperJsStrings.top
      - typingsJapgolly.popperJs.popperJsStrings.right
      - typingsJapgolly.popperJs.popperJsStrings.bottom
      - typingsJapgolly.popperJs.popperJsStrings.left
    */
    trait Position extends StObject
    object Position {
      
      inline def bottom: typingsJapgolly.popperJs.popperJsStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.bottom]
      
      inline def left: typingsJapgolly.popperJs.popperJsStrings.left = "left".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.left]
      
      inline def right: typingsJapgolly.popperJs.popperJsStrings.right = "right".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.right]
      
      inline def top: typingsJapgolly.popperJs.popperJsStrings.top = "top".asInstanceOf[typingsJapgolly.popperJs.popperJsStrings.top]
    }
    
    trait ReferenceObject extends StObject {
      
      var clientHeight: Double
      
      var clientWidth: Double
      
      def getBoundingClientRect(): ClientRect
      
      var referenceNode: js.UndefOr[Node] = js.undefined
    }
    object ReferenceObject {
      
      inline def apply(clientHeight: Double, clientWidth: Double, getBoundingClientRect: CallbackTo[ClientRect]): typingsJapgolly.popperJs.mod.Popper.ReferenceObject = {
        val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], getBoundingClientRect = getBoundingClientRect.toJsFn)
        __obj.asInstanceOf[typingsJapgolly.popperJs.mod.Popper.ReferenceObject]
      }
      
      extension [Self <: typingsJapgolly.popperJs.mod.Popper.ReferenceObject](x: Self) {
        
        inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
        
        inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
        
        inline def setGetBoundingClientRect(value: CallbackTo[ClientRect]): Self = StObject.set(x, "getBoundingClientRect", value.toJsFn)
        
        inline def setReferenceNode(value: Node): Self = StObject.set(x, "referenceNode", value.asInstanceOf[js.Any])
        
        inline def setReferenceNodeUndefined: Self = StObject.set(x, "referenceNode", js.undefined)
      }
    }
  }
  
  type PopperOptions = typingsJapgolly.popperJs.mod.Popper.PopperOptions
  
  type Position = typingsJapgolly.popperJs.mod.Popper.Position
  
  type ReferenceObject = typingsJapgolly.popperJs.mod.Popper.ReferenceObject
}
