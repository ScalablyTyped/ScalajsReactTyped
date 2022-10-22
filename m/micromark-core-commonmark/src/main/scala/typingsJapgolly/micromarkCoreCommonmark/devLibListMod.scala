package typingsJapgolly.micromarkCoreCommonmark

import typingsJapgolly.micromarkCoreCommonmark.anon.Marker
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibListMod {
  
  @JSImport("micromark-core-commonmark/dev/lib/list", "list")
  @js.native
  val list: Construct = js.native
  
  type Code = typingsJapgolly.micromarkUtilTypes.mod.Code
  
  type Construct = typingsJapgolly.micromarkUtilTypes.mod.Construct
  
  type Exiter = typingsJapgolly.micromarkUtilTypes.mod.Exiter
  
  type ListContainerState = (Record[String, Any]) & Marker
  
  type State = typingsJapgolly.micromarkUtilTypes.mod.State
  
  type TokenizeContext = typingsJapgolly.micromarkUtilTypes.mod.TokenizeContext
  
  @js.native
  trait TokenizeContextWithState
    extends StObject
       with typingsJapgolly.micromarkUtilTypes.mod.TokenizeContext {
    
    @JSName("containerState")
    var containerState_TokenizeContextWithState: ListContainerState = js.native
  }
  
  type Tokenizer = typingsJapgolly.micromarkUtilTypes.mod.Tokenizer
}
