package typingsJapgolly.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "SingleEntryPlugin")
@js.native
open class SingleEntryPlugin protected ()
  extends StObject
     with EntryPlugin {
  /**
  	 * An entry plugin which will handle
  	 * creation of the EntryDependency
  	 */
  def this(context: String, entry: String) = this()
  def this(context: String, entry: String, options: String) = this()
  def this(context: String, entry: String, options: EntryOptions) = this()
  
  /**
  	 * Apply the plugin
  	 */
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: Compiler): Unit = js.native
  
  /* CompleteClass */
  var context: String = js.native
  
  /* CompleteClass */
  var entry: String = js.native
  
  /* CompleteClass */
  var options: String | EntryOptions = js.native
}
object SingleEntryPlugin {
  
  @JSImport("webpack", "SingleEntryPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createDependency(entry: String, options: String): EntryDependency = (^.asInstanceOf[js.Dynamic].applyDynamic("createDependency")(entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EntryDependency]
  inline def createDependency(entry: String, options: EntryOptions): EntryDependency = (^.asInstanceOf[js.Dynamic].applyDynamic("createDependency")(entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EntryDependency]
}
