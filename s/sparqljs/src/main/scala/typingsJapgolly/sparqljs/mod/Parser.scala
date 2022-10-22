package typingsJapgolly.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("sparqljs", "Parser")
@js.native
open class Parser ()
  extends StObject
     with SparqlParser {
  def this(options: ParserOptions) = this()
  
  /* CompleteClass */
  override def parse(query: String): SparqlQuery = js.native
}
