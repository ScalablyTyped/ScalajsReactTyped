package typingsJapgolly.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderPaginationMetadata
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGetPaginationVariablesMod {
  
  @JSImport("relay-runtime/lib/util/getPaginationVariables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    direction: Direction,
    count: Double,
    cursor: String,
    baseVariables: Variables,
    extraVariables: Variables,
    paginationMetadata: ReaderPaginationMetadata
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(direction.asInstanceOf[js.Any], count.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], baseVariables.asInstanceOf[js.Any], extraVariables.asInstanceOf[js.Any], paginationMetadata.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def default(
    direction: Direction,
    count: Double,
    cursor: Null,
    baseVariables: Variables,
    extraVariables: Variables,
    paginationMetadata: ReaderPaginationMetadata
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(direction.asInstanceOf[js.Any], count.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], baseVariables.asInstanceOf[js.Any], extraVariables.asInstanceOf[js.Any], paginationMetadata.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def default(
    direction: Direction,
    count: Double,
    cursor: Unit,
    baseVariables: Variables,
    extraVariables: Variables,
    paginationMetadata: ReaderPaginationMetadata
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(direction.asInstanceOf[js.Any], count.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], baseVariables.asInstanceOf[js.Any], extraVariables.asInstanceOf[js.Any], paginationMetadata.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.relayRuntime.relayRuntimeStrings.forward
    - typingsJapgolly.relayRuntime.relayRuntimeStrings.backward
  */
  trait Direction extends StObject
  object Direction {
    
    inline def backward: typingsJapgolly.relayRuntime.relayRuntimeStrings.backward = "backward".asInstanceOf[typingsJapgolly.relayRuntime.relayRuntimeStrings.backward]
    
    inline def forward: typingsJapgolly.relayRuntime.relayRuntimeStrings.forward = "forward".asInstanceOf[typingsJapgolly.relayRuntime.relayRuntimeStrings.forward]
  }
}
