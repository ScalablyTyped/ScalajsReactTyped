package typingsJapgolly.rdflib

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.DataFactory
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.DefaultFactoryTypes
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.Indexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoriesCanonicalDataFactoryMod extends Shortcut {
  
  /** A basic internal RDFlib datafactory, which does not support Collections  */
  @JSImport("rdflib/lib/factories/canonical-data-factory", JSImport.Default)
  @js.native
  val default: DataFactory[DefaultFactoryTypes, Indexable] = js.native
  
  @JSImport("rdflib/lib/factories/canonical-data-factory", "defaultGraphURI")
  @js.native
  val defaultGraphURI: /* "chrome:theSession" */ String = js.native
  
  type _To = DataFactory[DefaultFactoryTypes, Indexable]
  
  /* This means you don't have to write `default`, but can instead just say `libFactoriesCanonicalDataFactoryMod.foo` */
  override def _to: DataFactory[DefaultFactoryTypes, Indexable] = default
}
