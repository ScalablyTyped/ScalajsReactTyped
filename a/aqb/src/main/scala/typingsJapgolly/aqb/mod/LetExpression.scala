package typingsJapgolly.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LetExpression
  extends StObject
     with PartialStatement
     with Instantiable2[/* prev */ PartialStatement, /* dfns (repeated) */ Any, PartialStatement] {
  
  var _dfns: Definitions = js.native
  
  var _prev: PartialStatement = js.native
  
  def toAQL(): String = js.native
}
