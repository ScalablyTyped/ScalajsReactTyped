package typingsJapgolly.rdflib

import typingsJapgolly.rdflib.anon.Fetcher
import typingsJapgolly.rdflib.libTfTypesMod.Quad
import typingsJapgolly.rdflib.libTfTypesMod.QuadGraph
import typingsJapgolly.rdflib.libTfTypesMod.QuadObject
import typingsJapgolly.rdflib.libTfTypesMod.QuadPredicate
import typingsJapgolly.rdflib.libTfTypesMod.QuadSubject
import typingsJapgolly.rdflib.libTfTypesMod.RdfJsDataFactory
import typingsJapgolly.rdflib.libTfTypesMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("rdflib/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AJARHandleNewTerm(kb: Fetcher, p: Any, requestedBy: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("AJAR_handleNewTerm")(kb.asInstanceOf[js.Any], p.asInstanceOf[js.Any], requestedBy.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def ArrayIndexOf(arr: Any, item: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayIndexOf")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def ArrayIndexOf(arr: Any, item: Any, i: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayIndexOf")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("rdflib/lib/utils", "appliedFactoryMethods")
  @js.native
  val appliedFactoryMethods: js.Array[String] = js.native
  
  inline def arrayToStatements(rdfFactory: RdfJsDataFactory, subject: QuadSubject, data: js.Array[Term]): js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayToStatements")(rdfFactory.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]]]
}
