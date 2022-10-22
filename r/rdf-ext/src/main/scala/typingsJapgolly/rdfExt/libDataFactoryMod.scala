package typingsJapgolly.rdfExt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.rdfExt.libPropTypeMod.PropType
import typingsJapgolly.rdfExt.rdfExtStrings.graph
import typingsJapgolly.rdfjsTypes.dataModelMod.DataFactory
import typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadGraph
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadObject
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadPredicate
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadSubject
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCoreFactory
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataFactoryMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataFactoryExt
  @JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def blankNode(): typingsJapgolly.rdfExt.libBlankNodeMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")().asInstanceOf[typingsJapgolly.rdfExt.libBlankNodeMod.^]
  inline def blankNode(value: String): typingsJapgolly.rdfExt.libBlankNodeMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rdfExt.libBlankNodeMod.^]
  
  /* static member */
  inline def dataset(): typingsJapgolly.rdfExt.libDatasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("dataset")().asInstanceOf[typingsJapgolly.rdfExt.libDatasetMod.^]
  inline def dataset(quads: js.Array[Quad]): typingsJapgolly.rdfExt.libDatasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rdfExt.libDatasetMod.^]
  
  inline def dataset_graph(quads: js.Array[Quad], graph: PropType[typingsJapgolly.rdfExt.libQuadMod.^, graph]): typingsJapgolly.rdfExt.libDatasetMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.rdfExt.libDatasetMod.^]
  inline def dataset_graph(quads: Unit, graph: PropType[typingsJapgolly.rdfExt.libQuadMod.^, graph]): typingsJapgolly.rdfExt.libDatasetMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.rdfExt.libDatasetMod.^]
  
  /* static member */
  inline def defaultGraph(): typingsJapgolly.rdfExt.libDefaultGraphMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGraph")().asInstanceOf[typingsJapgolly.rdfExt.libDefaultGraphMod.^]
  
  /* static member */
  /* static member */
  object defaults {
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.BlankNode")
    @js.native
    def BlankNode: typingsJapgolly.rdfExt.libBlankNodeMod.^ = js.native
    inline def BlankNode_=(x: typingsJapgolly.rdfExt.libBlankNodeMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlankNode")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Dataset")
    @js.native
    def Dataset: typingsJapgolly.rdfExt.libDatasetMod.^ = js.native
    inline def Dataset_=(x: typingsJapgolly.rdfExt.libDatasetMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dataset")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Literal")
    @js.native
    def Literal: typingsJapgolly.rdfExt.libLiteralMod.^ = js.native
    inline def Literal_=(x: typingsJapgolly.rdfExt.libLiteralMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Literal")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.NamedNode")
    @js.native
    def NamedNode: typingsJapgolly.rdfExt.libNamedNodeMod.^[String] = js.native
    inline def NamedNode_=(x: typingsJapgolly.rdfExt.libNamedNodeMod.^[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedNode")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rdf-ext/lib/DataFactory", "defaults.PrefixMap")
    @js.native
    open class PrefixMap protected ()
      extends typingsJapgolly.rdfExt.libPrefixMapMod.^ {
      def this(factory: DataFactory[Quad, Quad], prefixes: typingsJapgolly.rdfExt.libPrefixMapMod.Prefixes) = this()
    }
    @JSImport("rdf-ext/lib/DataFactory", "defaults.PrefixMap")
    @js.native
    def PrefixMap: Instantiable2[
        /* factory */ DataFactory[Quad, Quad], 
        /* prefixes */ typingsJapgolly.rdfExt.libPrefixMapMod.Prefixes, 
        typingsJapgolly.rdfExt.libPrefixMapMod.^
      ] = js.native
    inline def PrefixMap_=(
      x: Instantiable2[
          /* factory */ DataFactory[Quad, Quad], 
          /* prefixes */ typingsJapgolly.rdfExt.libPrefixMapMod.Prefixes, 
          typingsJapgolly.rdfExt.libPrefixMapMod.^
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrefixMap")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Quad")
    @js.native
    def Quad: typingsJapgolly.rdfExt.libQuadMod.^ = js.native
    inline def Quad_=(x: typingsJapgolly.rdfExt.libQuadMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quad")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Variable")
    @js.native
    def Variable: typingsJapgolly.rdfExt.libVariableMod.^ = js.native
    inline def Variable_=(x: typingsJapgolly.rdfExt.libVariableMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variable")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.defaultGraph")
    @js.native
    def defaultGraph: typingsJapgolly.rdfExt.libDefaultGraphMod.^ = js.native
    inline def defaultGraph_=(x: typingsJapgolly.rdfExt.libDefaultGraphMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultGraph")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext/lib/DataFactory", "factory")
  @js.native
  open class factory ()
    extends StObject
       with DataFactoryExt
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "factory")
  @js.native
  def factory: Instantiable0[DataFactoryExt] = js.native
  inline def factory_=(x: Instantiable0[DataFactoryExt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("factory")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def graph(): typingsJapgolly.rdfExt.libDatasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")().asInstanceOf[typingsJapgolly.rdfExt.libDatasetMod.^]
  inline def graph(quads: Any): typingsJapgolly.rdfExt.libDatasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")(quads.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rdfExt.libDatasetMod.^]
  
  /* static member */
  inline def literal(value: String): typingsJapgolly.rdfExt.libLiteralMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rdfExt.libLiteralMod.^]
  inline def literal(value: String, languageOrDatatype: String): typingsJapgolly.rdfExt.libLiteralMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.rdfExt.libLiteralMod.^]
  inline def literal(value: String, languageOrDatatype: NamedNode[String]): typingsJapgolly.rdfExt.libLiteralMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.rdfExt.libLiteralMod.^]
  
  /* static member */
  inline def namedNode[Iri /* <: String */](value: Iri): typingsJapgolly.rdfExt.libNamedNodeMod.^[Iri] = ^.asInstanceOf[js.Dynamic].applyDynamic("namedNode")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rdfExt.libNamedNodeMod.^[Iri]]
  
  /* static member */
  inline def prefixMap(prefixes: Prefixes): typingsJapgolly.rdfExt.libPrefixMapMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixMap")(prefixes.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rdfExt.libPrefixMapMod.^]
  
  /* static member */
  inline def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typingsJapgolly.rdfExt.libQuadMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.rdfExt.libQuadMod.^]
  inline def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): typingsJapgolly.rdfExt.libQuadMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.rdfExt.libQuadMod.^]
  
  /* static member */
  inline def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typingsJapgolly.rdfExt.libQuadMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("triple")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.rdfExt.libQuadMod.^]
  
  /* static member */
  inline def variable(value: String): typingsJapgolly.rdfExt.libVariableMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rdfExt.libVariableMod.^]
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  trait DataFactoryExt
    extends StObject
       with DataFactory[typingsJapgolly.rdfExt.libQuadMod.^, Quad]
       with DatasetCoreFactory[typingsJapgolly.rdfExt.libQuadMod.^, Quad, typingsJapgolly.rdfExt.libDatasetMod.^] {
    
    @JSName("dataset")
    def dataset_graph(quads: js.Array[Quad], graph: PropType[typingsJapgolly.rdfExt.libQuadMod.^, graph]): typingsJapgolly.rdfExt.libDatasetMod.^ = js.native
    @JSName("dataset")
    def dataset_graph(quads: Unit, graph: PropType[typingsJapgolly.rdfExt.libQuadMod.^, graph]): typingsJapgolly.rdfExt.libDatasetMod.^ = js.native
    
    def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typingsJapgolly.rdfExt.libQuadMod.^ = js.native
    def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): typingsJapgolly.rdfExt.libQuadMod.^ = js.native
    
    @JSName("variable")
    def variable_MDataFactoryExt(value: String): typingsJapgolly.rdfExt.libVariableMod.^ = js.native
  }
  
  type Prefixes = typingsJapgolly.rdfExt.libPrefixMapMod.^ | PrefixesRecord
  
  type PrefixesRecord = Record[String, NamedNode[String] | String]
}
