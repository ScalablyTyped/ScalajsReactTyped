package typingsJapgolly.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("js-joda", "TemporalAccessor")
@js.native
open class TemporalAccessor () extends StObject {
  
  def get(field: TemporalField): Double = js.native
  
  def query(query: TemporalQuery): Any = js.native
  
  def range(field: TemporalField): ValueRange = js.native
}
