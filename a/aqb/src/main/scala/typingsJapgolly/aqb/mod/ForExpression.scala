package typingsJapgolly.aqb.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForExpression
  extends StObject
     with PartialStatement
     with Instantiable3[/* prev */ PartialStatement, /* varname */ Any, /* expr */ Any, PartialStatement] {
  
  var _varname: Identifier = js.native
  
  def toAQL(): String = js.native
}
