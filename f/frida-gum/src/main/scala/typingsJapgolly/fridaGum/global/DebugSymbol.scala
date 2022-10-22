package typingsJapgolly.fridaGum.global

import typingsJapgolly.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("DebugSymbol")
@js.native
open class DebugSymbol ()
  extends StObject
     with typingsJapgolly.fridaGum.DebugSymbol {
  
  /**
    * Address that this symbol is for.
    */
  /* CompleteClass */
  var address: typingsJapgolly.fridaGum.NativePointer = js.native
  
  /**
    * File name owning this symbol, or `null` if unknown.
    */
  /* CompleteClass */
  var fileName: String | Null = js.native
  
  /**
    * Line number in `fileName`, or `null` if unknown.
    */
  /* CompleteClass */
  var lineNumber: Double | Null = js.native
  
  /**
    * Module name owning this symbol, or `null` if unknown.
    */
  /* CompleteClass */
  var moduleName: String | Null = js.native
  
  /**
    * Name of the symbol, or `null` if unknown.
    */
  /* CompleteClass */
  var name: String | Null = js.native
}
object DebugSymbol {
  
  @JSGlobal("DebugSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Resolves function names matching `glob` and returns their addresses.
    *
    * @param glob Glob matching functions to resolve the addresses of.
    */
  /* static member */
  inline def findFunctionsMatching(glob: String): js.Array[typingsJapgolly.fridaGum.NativePointer] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFunctionsMatching")(glob.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.fridaGum.NativePointer]]
  
  /**
    * Resolves a function name and returns its addresses.
    *
    * @param name Function name to resolve the addresses of.
    */
  /* static member */
  inline def findFunctionsNamed(name: String): js.Array[typingsJapgolly.fridaGum.NativePointer] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFunctionsNamed")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.fridaGum.NativePointer]]
  
  /**
    * Looks up debug information for `address`.
    *
    * @param address Address to look up details for.
    */
  /* static member */
  inline def fromAddress(address: NativePointerValue): typingsJapgolly.fridaGum.DebugSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fridaGum.DebugSymbol]
  
  /**
    * Looks up debug information for `name`.
    *
    * @param name Name to look up details for.
    */
  /* static member */
  inline def fromName(name: String): typingsJapgolly.fridaGum.DebugSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fridaGum.DebugSymbol]
  
  /**
    * Resolves a function name and returns its address. Returns the first if
    * more than one function is found. Throws an exception if the name cannot
    * be resolved.
    *
    * @param name Function name to resolve the address of.
    */
  /* static member */
  inline def getFunctionByName(name: String): typingsJapgolly.fridaGum.NativePointer = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionByName")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fridaGum.NativePointer]
  
  /**
    * Loads debug symbols for a specific module.
    *
    * @param path Path of module to load symbols for.
    */
  /* static member */
  inline def load(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
