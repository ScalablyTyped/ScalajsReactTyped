package typingsJapgolly.rdflib

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rdflib.libCollectionMod.Collection
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.DataFactory
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.DefaultFactoryTypes
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.Indexable
import typingsJapgolly.rdflib.libTypesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoriesExtendedTermFactoryMod extends Shortcut {
  
  /**
    * Data factory which also supports Collections
    *
    * Necessary for preventing circular dependencies.
    */
  @JSImport("rdflib/lib/factories/extended-term-factory", JSImport.Default)
  @js.native
  val default: CollectionFactory = js.native
  
  @js.native
  trait CollectionFactory
    extends StObject
       with DataFactory[DefaultFactoryTypes, Indexable] {
    
    def collection(elements: js.Array[ValueType]): typingsJapgolly.rdflib.libCollectionMod.default[
        typingsJapgolly.rdflib.libNodeInternalMod.default | typingsJapgolly.rdflib.libBlankNodeMod.default | Collection[Any] | typingsJapgolly.rdflib.libLiteralMod.default | typingsJapgolly.rdflib.libVariableMod.default
      ] = js.native
  }
  
  type _To = CollectionFactory
  
  /* This means you don't have to write `default`, but can instead just say `libFactoriesExtendedTermFactoryMod.foo` */
  override def _to: CollectionFactory = default
}
