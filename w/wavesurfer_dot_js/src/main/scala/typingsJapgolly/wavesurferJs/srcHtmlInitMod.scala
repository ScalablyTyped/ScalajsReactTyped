package typingsJapgolly.wavesurferJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.wavesurferJs.typesParamsMod.WaveSurferParams
import typingsJapgolly.wavesurferJs.typesPluginMod.PluginDefinition
import typingsJapgolly.wavesurferJs.typesPluginMod.WaveSurferPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHtmlInitMod {
  
  @JSImport("wavesurfer.js/src/html-init", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Init {
    def this(waveSurfer: typingsJapgolly.wavesurferJs.srcWavesurferMod.default) = this()
    def this(waveSurfer: typingsJapgolly.wavesurferJs.srcWavesurferMod.default, params: InitParams) = this()
    
    /** The nodes that should have instances attached to them. */
    /* CompleteClass */
    override val containers: NodeList[Node] = js.native
    
    /** Initialize all container elements. */
    /* CompleteClass */
    override def initAllEls(): Unit = js.native
    
    /** Initialize a single container element and add to `this.instances`. */
    /* CompleteClass */
    override def initEl(el: HTMLElement, plugins: js.Array[PluginDefinition]): typingsJapgolly.wavesurferJs.srcWavesurferMod.default = js.native
    
    /** An array of wavesurfer instances. */
    /* CompleteClass */
    override val instances: js.Array[typingsJapgolly.wavesurferJs.srcWavesurferMod.default] = js.native
  }
  
  trait Init extends StObject {
    
    /** The nodes that should have instances attached to them. */
    val containers: NodeList[Node]
    
    /** Initialize all container elements. */
    def initAllEls(): Unit
    
    /** Initialize a single container element and add to `this.instances`. */
    def initEl(el: HTMLElement, plugins: js.Array[PluginDefinition]): typingsJapgolly.wavesurferJs.srcWavesurferMod.default
    
    /** An array of wavesurfer instances. */
    val instances: js.Array[typingsJapgolly.wavesurferJs.srcWavesurferMod.default]
  }
  object Init {
    
    inline def apply(
      containers: NodeList[Node],
      initAllEls: Callback,
      initEl: (HTMLElement, js.Array[PluginDefinition]) => typingsJapgolly.wavesurferJs.srcWavesurferMod.default,
      instances: js.Array[typingsJapgolly.wavesurferJs.srcWavesurferMod.default]
    ): Init = {
      val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], initAllEls = initAllEls.toJsFn, initEl = js.Any.fromFunction2(initEl), instances = instances.asInstanceOf[js.Any])
      __obj.asInstanceOf[Init]
    }
    
    extension [Self <: Init](x: Self) {
      
      inline def setContainers(value: NodeList[Node]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      inline def setInitAllEls(value: Callback): Self = StObject.set(x, "initAllEls", value.toJsFn)
      
      inline def setInitEl(
        value: (HTMLElement, js.Array[PluginDefinition]) => typingsJapgolly.wavesurferJs.srcWavesurferMod.default
      ): Self = StObject.set(x, "initEl", js.Any.fromFunction2(value))
      
      inline def setInstances(value: js.Array[typingsJapgolly.wavesurferJs.srcWavesurferMod.default]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setInstancesVarargs(value: typingsJapgolly.wavesurferJs.srcWavesurferMod.default*): Self = StObject.set(x, "instances", js.Array(value*))
    }
  }
  
  trait InitParams extends StObject {
    
    /** Selector or NodeList of elements to attach instances to. */
    var containers: js.UndefOr[String | NodeList[Node]] = js.undefined
    
    /** The default wavesurfer initialisation parameters (default: { backend: 'MediaElement', mediaControls: true }). */
    var defaults: js.UndefOr[WaveSurferParams] = js.undefined
    
    /** If set overwrites the default request function, can be used to inject plugins differently. */
    var loadPlugin: js.UndefOr[
        js.Function2[
          /* pluginName */ String, 
          /* callback */ js.Function1[/* plugin */ WaveSurferPlugin, Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** URL template for the dynamic loading of plugins (default: '//localhost:8080/dist/plugin/wavesurfer.[name].js'). */
    var pluginCdnTemplate: js.UndefOr[String] = js.undefined
  }
  object InitParams {
    
    inline def apply(): InitParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitParams]
    }
    
    extension [Self <: InitParams](x: Self) {
      
      inline def setContainers(value: String | NodeList[Node]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
      
      inline def setDefaults(value: WaveSurferParams): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setLoadPlugin(
        value: (/* pluginName */ String, /* callback */ js.Function1[/* plugin */ WaveSurferPlugin, Unit]) => Callback
      ): Self = StObject.set(x, "loadPlugin", js.Any.fromFunction2((t0: /* pluginName */ String, t1: /* callback */ js.Function1[/* plugin */ WaveSurferPlugin, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setLoadPluginUndefined: Self = StObject.set(x, "loadPlugin", js.undefined)
      
      inline def setPluginCdnTemplate(value: String): Self = StObject.set(x, "pluginCdnTemplate", value.asInstanceOf[js.Any])
      
      inline def setPluginCdnTemplateUndefined: Self = StObject.set(x, "pluginCdnTemplate", js.undefined)
    }
  }
}
