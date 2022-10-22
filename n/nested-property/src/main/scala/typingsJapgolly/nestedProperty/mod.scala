package typingsJapgolly.nestedProperty

import typingsJapgolly.nestedProperty.anon.Own
import typingsJapgolly.nestedProperty.anon.ValidPath
import typingsJapgolly.std.Error
import typingsJapgolly.std.ErrorConstructor
import typingsJapgolly.std.ErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nested-property", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("nested-property", "ObjectPrototypeMutationError")
  @js.native
  /* standard es5 */
  open class ObjectPrototypeMutationError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, options: ErrorOptions) = this()
    def this(message: Unit, options: ErrorOptions) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  object ObjectPrototypeMutationError {
    
    /* standard es5 */
    /* standard es2022.error */
    inline def apply(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectPrototypeMutationError")().asInstanceOf[js.Error]
    inline def apply(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectPrototypeMutationError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    inline def apply(message: String, options: ErrorOptions): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("ObjectPrototypeMutationError")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Error]
    inline def apply(message: Unit, options: ErrorOptions): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("ObjectPrototypeMutationError")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  }
  @JSImport("nested-property", "ObjectPrototypeMutationError")
  @js.native
  def ObjectPrototypeMutationError_Fmod: ErrorConstructor = js.native
  
  inline def ObjectPrototypeMutationError_Fmod_=(x: ErrorConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectPrototypeMutationError")(x.asInstanceOf[js.Any])
  
  inline def get(`object`: Any, property: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def has(`object`: Any, property: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has(`object`: Any, property: String, options: Own): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInNestedProperty(`object`: Any, property: String, objectInPath: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInNestedProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], objectInPath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isInNestedProperty(`object`: Any, property: String, objectInPath: Any, options: ValidPath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInNestedProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], objectInPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def set(`object`: Any, property: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
}
