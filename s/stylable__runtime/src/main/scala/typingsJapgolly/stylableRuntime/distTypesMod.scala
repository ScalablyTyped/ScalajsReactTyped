package typingsJapgolly.stylableRuntime

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait AttributeMap
    extends StObject
       with /* attributeName */ StringDictionary[StateValue] {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object AttributeMap {
    
    inline def apply(): AttributeMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeMap]
    }
    
    extension [Self <: AttributeMap](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait ClassesMap
    extends StObject
       with /* className */ StringDictionary[String] {
    
    var root: String
  }
  object ClassesMap {
    
    inline def apply(root: String): ClassesMap = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassesMap]
    }
    
    extension [Self <: ClassesMap](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var stc: js.UndefOr[
        js.Function2[/* namespace */ String, /* stateMapping */ js.UndefOr[StateMap | Null], String]
      ] = js.undefined
    
    var sti: js.UndefOr[
        js.Function4[
          /* namespace */ String, 
          /* css */ String, 
          /* depth */ Double, 
          /* runtimeId */ String, 
          Unit
        ]
      ] = js.undefined
    
    var sts: js.UndefOr[
        js.Function4[
          /* namespace */ String, 
          /* context */ js.UndefOr[String], 
          /* stateOrClass */ js.UndefOr[String | StateMap], 
          /* repeated */ js.UndefOr[String], 
          String
        ]
      ] = js.undefined
  }
  object Host {
    
    inline def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setStc(value: (/* namespace */ String, /* stateMapping */ js.UndefOr[StateMap | Null]) => String): Self = StObject.set(x, "stc", js.Any.fromFunction2(value))
      
      inline def setStcUndefined: Self = StObject.set(x, "stc", js.undefined)
      
      inline def setSti(
        value: (/* namespace */ String, /* css */ String, /* depth */ Double, /* runtimeId */ String) => Callback
      ): Self = StObject.set(x, "sti", js.Any.fromFunction4((t0: /* namespace */ String, t1: /* css */ String, t2: /* depth */ Double, t3: /* runtimeId */ String) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setStiUndefined: Self = StObject.set(x, "sti", js.undefined)
      
      inline def setSts(
        value: (/* namespace */ String, /* context */ js.UndefOr[String], /* stateOrClass */ js.UndefOr[String | StateMap], /* repeated */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "sts", js.Any.fromFunction4(value))
      
      inline def setStsUndefined: Self = StObject.set(x, "sts", js.undefined)
    }
  }
  
  trait InheritedAttributes
    extends StObject
       with /* props */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object InheritedAttributes {
    
    inline def apply(): InheritedAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InheritedAttributes]
    }
    
    extension [Self <: InheritedAttributes](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  @js.native
  trait NodeRenderer[I, O /* <: Element */] extends StObject {
    
    def create(stylesheet: I, key: String): O = js.native
    def create(stylesheet: I, key: Double): O = js.native
    
    def hasKey(node: O): Boolean = js.native
    
    def renderKey(stylesheet: I): String | Double = js.native
    
    def update(stylesheet: I, node: O): O = js.native
  }
  
  trait RenderableStylesheet extends StObject {
    
    @JSName("$css")
    var $css: js.UndefOr[String] = js.undefined
    
    @JSName("$depth")
    var $depth: Double
    
    @JSName("$id")
    var $id: String | Double
  }
  object RenderableStylesheet {
    
    inline def apply($depth: Double, $id: String | Double): RenderableStylesheet = {
      val __obj = js.Dynamic.literal($depth = $depth.asInstanceOf[js.Any], $id = $id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderableStylesheet]
    }
    
    extension [Self <: RenderableStylesheet](x: Self) {
      
      inline def set$css(value: String): Self = StObject.set(x, "$css", value.asInstanceOf[js.Any])
      
      inline def set$cssUndefined: Self = StObject.set(x, "$css", js.undefined)
      
      inline def set$depth(value: Double): Self = StObject.set(x, "$depth", value.asInstanceOf[js.Any])
      
      inline def set$id(value: String | Double): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
    }
  }
  
  type RuntimeStVar = String | StringDictionary[Any] | js.Array[Any]
  
  trait RuntimeStylesheet
    extends StObject
       with StylableExports
       with RenderableStylesheet {
    
    def cssStates(stateMap: StateMap): String
    
    var namespace: String
    
    def st(context: String, stateOrClass: String, classes: js.UndefOr[String]*): String
    def st(context: String, stateOrClass: Unit, classes: js.UndefOr[String]*): String
    def st(context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String
    def st(context: Unit, stateOrClass: String, classes: js.UndefOr[String]*): String
    def st(context: Unit, stateOrClass: Unit, classes: js.UndefOr[String]*): String
    def st(context: Unit, stateOrClass: StateMap, classes: js.UndefOr[String]*): String
    @JSName("st")
    var st_Original: STFunction
    
    def style(context: String, stateOrClass: String, classes: js.UndefOr[String]*): String
    def style(context: String, stateOrClass: Unit, classes: js.UndefOr[String]*): String
    def style(context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String
    def style(context: Unit, stateOrClass: String, classes: js.UndefOr[String]*): String
    def style(context: Unit, stateOrClass: Unit, classes: js.UndefOr[String]*): String
    def style(context: Unit, stateOrClass: StateMap, classes: js.UndefOr[String]*): String
    @JSName("style")
    var style_Original: STFunction
  }
  object RuntimeStylesheet {
    
    inline def apply(
      $depth: Double,
      $id: String | Double,
      classes: ClassesMap,
      cssStates: StateMap => String,
      keyframes: Record[String, String],
      layers: Record[String, String],
      namespace: String,
      st: STFunction,
      stVars: Record[String, RuntimeStVar],
      style: STFunction,
      vars: Record[String, String]
    ): RuntimeStylesheet = {
      val __obj = js.Dynamic.literal($depth = $depth.asInstanceOf[js.Any], $id = $id.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], cssStates = js.Any.fromFunction1(cssStates), keyframes = keyframes.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any], stVars = stVars.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeStylesheet]
    }
    
    extension [Self <: RuntimeStylesheet](x: Self) {
      
      inline def setCssStates(value: StateMap => String): Self = StObject.set(x, "cssStates", js.Any.fromFunction1(value))
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setSt(value: STFunction): Self = StObject.set(x, "st", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: STFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait STFunction extends StObject {
    
    def apply(context: String, stateOrClass: String, classes: js.UndefOr[String]*): String = js.native
    def apply(context: String, stateOrClass: Unit, classes: js.UndefOr[String]*): String = js.native
    def apply(context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String = js.native
    def apply(context: Unit, stateOrClass: String, classes: js.UndefOr[String]*): String = js.native
    def apply(context: Unit, stateOrClass: Unit, classes: js.UndefOr[String]*): String = js.native
    def apply(context: Unit, stateOrClass: StateMap, classes: js.UndefOr[String]*): String = js.native
  }
  
  type StateMap = StringDictionary[StateValue]
  
  type StateValue = js.UndefOr[Boolean | Double | String]
  
  trait StylableExports extends StObject {
    
    var classes: ClassesMap
    
    var keyframes: Record[String, String]
    
    var layers: Record[String, String]
    
    var stVars: Record[String, RuntimeStVar]
    
    var vars: Record[String, String]
  }
  object StylableExports {
    
    inline def apply(
      classes: ClassesMap,
      keyframes: Record[String, String],
      layers: Record[String, String],
      stVars: Record[String, RuntimeStVar],
      vars: Record[String, String]
    ): StylableExports = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], stVars = stVars.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylableExports]
    }
    
    extension [Self <: StylableExports](x: Self) {
      
      inline def setClasses(value: ClassesMap): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setKeyframes(value: Record[String, String]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: Record[String, String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setStVars(value: Record[String, RuntimeStVar]): Self = StObject.set(x, "stVars", value.asInstanceOf[js.Any])
      
      inline def setVars(value: Record[String, String]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    }
  }
}
