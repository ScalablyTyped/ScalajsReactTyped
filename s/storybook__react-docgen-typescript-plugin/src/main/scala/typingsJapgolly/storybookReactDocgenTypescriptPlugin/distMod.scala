package typingsJapgolly.storybookReactDocgenTypescriptPlugin

import typingsJapgolly.storybookReactDocgenTypescriptPlugin.anon.CompilerOptions
import typingsJapgolly.storybookReactDocgenTypescriptPlugin.distPluginMod.DocgenPlugin
import typingsJapgolly.storybookReactDocgenTypescriptPlugin.distPluginMod.DocgenPluginType
import typingsJapgolly.storybookReactDocgenTypescriptPlugin.distPluginMod.PluginOptions
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@storybook/react-docgen-typescript-plugin/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@storybook/react-docgen-typescript-plugin/dist", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DocgenPlugin {
    def this(options: PluginOptions) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def applyWebpack4(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def applyWebpack5(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def getOptions(): CompilerOptions = js.native
    
    /* private */ /* CompleteClass */
    var name: Any = js.native
    
    /* private */ /* CompleteClass */
    var options: Any = js.native
  }
  @JSImport("@storybook/react-docgen-typescript-plugin/dist", JSImport.Default)
  @js.native
  def default: DocgenPluginType = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@storybook/react-docgen-typescript-plugin/dist", "ReactDocgenTypeScriptPlugin")
  @js.native
  open class ReactDocgenTypeScriptPlugin ()
    extends StObject
       with DocgenPlugin {
    def this(options: PluginOptions) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def applyWebpack4(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def applyWebpack5(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def getOptions(): CompilerOptions = js.native
    
    /* private */ /* CompleteClass */
    var name: Any = js.native
    
    /* private */ /* CompleteClass */
    var options: Any = js.native
  }
  @JSImport("@storybook/react-docgen-typescript-plugin/dist", "ReactDocgenTypeScriptPlugin")
  @js.native
  def ReactDocgenTypeScriptPlugin: DocgenPluginType = js.native
  inline def ReactDocgenTypeScriptPlugin_=(x: DocgenPluginType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactDocgenTypeScriptPlugin")(x.asInstanceOf[js.Any])
  
  inline def default_=(x: DocgenPluginType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
