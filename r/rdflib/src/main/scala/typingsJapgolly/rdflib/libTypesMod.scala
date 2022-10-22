package typingsJapgolly.rdflib

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.DataFactory
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.Indexable
import typingsJapgolly.rdflib.libNodeInternalMod.default
import typingsJapgolly.rdflib.libTfTypesMod.QuadGraph
import typingsJapgolly.rdflib.libTfTypesMod.QuadObject
import typingsJapgolly.rdflib.libTfTypesMod.QuadPredicate
import typingsJapgolly.rdflib.libTfTypesMod.QuadSubject
import typingsJapgolly.rdflib.libTfTypesMod.Term
import typingsJapgolly.rdflib.rdflibStrings.BlankNode
import typingsJapgolly.rdflib.rdflibStrings.Collection
import typingsJapgolly.rdflib.rdflibStrings.DefaultGraph
import typingsJapgolly.rdflib.rdflibStrings.Empty
import typingsJapgolly.rdflib.rdflibStrings.Graph
import typingsJapgolly.rdflib.rdflibStrings.Literal
import typingsJapgolly.rdflib.rdflibStrings.NamedNode
import typingsJapgolly.rdflib.rdflibStrings.Variable
import typingsJapgolly.rdflib.rdflibStrings.`applicationSlashn-quads`
import typingsJapgolly.rdflib.rdflibStrings.`applicationSlashn-triples`
import typingsJapgolly.rdflib.rdflibStrings.`applicationSlashsparql-update-single-match`
import typingsJapgolly.rdflib.rdflibStrings.`applicationSlashsparql-update`
import typingsJapgolly.rdflib.rdflibStrings.`applicationSlashx-turtle`
import typingsJapgolly.rdflib.rdflibStrings.applicationSlashldPlussignjson
import typingsJapgolly.rdflib.rdflibStrings.applicationSlashn3
import typingsJapgolly.rdflib.rdflibStrings.applicationSlashnquads
import typingsJapgolly.rdflib.rdflibStrings.applicationSlashrdfPlussignxml
import typingsJapgolly.rdflib.rdflibStrings.applicationSlashxhtmlPlussignxml
import typingsJapgolly.rdflib.rdflibStrings.textSlashhtml
import typingsJapgolly.rdflib.rdflibStrings.textSlashn3
import typingsJapgolly.rdflib.rdflibStrings.textSlashturtle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @JSImport("rdflib/lib/types", "BlankNodeTermType")
  @js.native
  val BlankNodeTermType: BlankNode = js.native
  
  @JSImport("rdflib/lib/types", "CollectionTermType")
  @js.native
  val CollectionTermType: Collection = js.native
  
  @JSImport("rdflib/lib/types", "DefaultGraphTermType")
  @js.native
  val DefaultGraphTermType: DefaultGraph = js.native
  
  @JSImport("rdflib/lib/types", "EmptyTermType")
  @js.native
  val EmptyTermType: Empty = js.native
  
  @JSImport("rdflib/lib/types", "GraphTermType")
  @js.native
  val GraphTermType: Graph = js.native
  
  @JSImport("rdflib/lib/types", "HTMLContentType")
  @js.native
  val HTMLContentType: textSlashhtml = js.native
  
  @JSImport("rdflib/lib/types", "JSONLDContentType")
  @js.native
  val JSONLDContentType: applicationSlashldPlussignjson = js.native
  
  @JSImport("rdflib/lib/types", "LiteralTermType")
  @js.native
  val LiteralTermType: Literal = js.native
  
  @JSImport("rdflib/lib/types", "N3ContentType")
  @js.native
  val N3ContentType: textSlashn3 = js.native
  
  @JSImport("rdflib/lib/types", "N3LegacyContentType")
  @js.native
  val N3LegacyContentType: applicationSlashn3 = js.native
  
  @JSImport("rdflib/lib/types", "NQuadsAltContentType")
  @js.native
  val NQuadsAltContentType: applicationSlashnquads = js.native
  
  @JSImport("rdflib/lib/types", "NQuadsContentType")
  @js.native
  val NQuadsContentType: `applicationSlashn-quads` = js.native
  
  @JSImport("rdflib/lib/types", "NTriplesContentType")
  @js.native
  val NTriplesContentType: `applicationSlashn-triples` = js.native
  
  @JSImport("rdflib/lib/types", "NamedNodeTermType")
  @js.native
  val NamedNodeTermType: NamedNode = js.native
  
  @JSImport("rdflib/lib/types", "RDFXMLContentType")
  @js.native
  val RDFXMLContentType: applicationSlashrdfPlussignxml = js.native
  
  @JSImport("rdflib/lib/types", "SPARQLUpdateContentType")
  @js.native
  val SPARQLUpdateContentType: `applicationSlashsparql-update` = js.native
  
  @JSImport("rdflib/lib/types", "SPARQLUpdateSingleMatchContentType")
  @js.native
  val SPARQLUpdateSingleMatchContentType: `applicationSlashsparql-update-single-match` = js.native
  
  @JSImport("rdflib/lib/types", "TurtleContentType")
  @js.native
  val TurtleContentType: textSlashturtle = js.native
  
  @JSImport("rdflib/lib/types", "TurtleLegacyContentType")
  @js.native
  val TurtleLegacyContentType: `applicationSlashx-turtle` = js.native
  
  @JSImport("rdflib/lib/types", "VariableTermType")
  @js.native
  val VariableTermType: Variable = js.native
  
  @JSImport("rdflib/lib/types", "XHTMLContentType")
  @js.native
  val XHTMLContentType: applicationSlashxhtmlPlussignxml = js.native
  
  type Bindings = StringDictionary[Term]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.rdflibStrings.applicationSlashrdfPlussignxml
    - typingsJapgolly.rdflib.rdflibStrings.textSlashhtml
    - typingsJapgolly.rdflib.rdflibStrings.applicationSlashldPlussignjson
    - typingsJapgolly.rdflib.rdflibStrings.textSlashn3
    - typingsJapgolly.rdflib.rdflibStrings.applicationSlashn3
    - typingsJapgolly.rdflib.rdflibStrings.applicationSlashnquads
    - typingsJapgolly.rdflib.rdflibStrings.`applicationSlashn-quads`
    - typingsJapgolly.rdflib.rdflibStrings.`applicationSlashsparql-update`
    - typingsJapgolly.rdflib.rdflibStrings.`applicationSlashsparql-update-single-match`
    - typingsJapgolly.rdflib.rdflibStrings.textSlashturtle
    - typingsJapgolly.rdflib.rdflibStrings.`applicationSlashx-turtle`
    - typingsJapgolly.rdflib.rdflibStrings.applicationSlashxhtmlPlussignxml
  */
  trait ContentType extends StObject
  object ContentType {
    
    inline def applicationSlashldPlussignjson: typingsJapgolly.rdflib.rdflibStrings.applicationSlashldPlussignjson = "application/ld+json".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.applicationSlashldPlussignjson]
    
    inline def `applicationSlashn-quads`: typingsJapgolly.rdflib.rdflibStrings.`applicationSlashn-quads` = "application/n-quads".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.`applicationSlashn-quads`]
    
    inline def applicationSlashn3: typingsJapgolly.rdflib.rdflibStrings.applicationSlashn3 = "application/n3".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.applicationSlashn3]
    
    inline def applicationSlashnquads: typingsJapgolly.rdflib.rdflibStrings.applicationSlashnquads = "application/nquads".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.applicationSlashnquads]
    
    inline def applicationSlashrdfPlussignxml: typingsJapgolly.rdflib.rdflibStrings.applicationSlashrdfPlussignxml = "application/rdf+xml".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.applicationSlashrdfPlussignxml]
    
    inline def `applicationSlashsparql-update`: typingsJapgolly.rdflib.rdflibStrings.`applicationSlashsparql-update` = "application/sparql-update".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.`applicationSlashsparql-update`]
    
    inline def `applicationSlashsparql-update-single-match`: typingsJapgolly.rdflib.rdflibStrings.`applicationSlashsparql-update-single-match` = "application/sparql-update-single-match".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.`applicationSlashsparql-update-single-match`]
    
    inline def `applicationSlashx-turtle`: typingsJapgolly.rdflib.rdflibStrings.`applicationSlashx-turtle` = "application/x-turtle".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.`applicationSlashx-turtle`]
    
    inline def applicationSlashxhtmlPlussignxml: typingsJapgolly.rdflib.rdflibStrings.applicationSlashxhtmlPlussignxml = "application/xhtml+xml".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.applicationSlashxhtmlPlussignxml]
    
    inline def textSlashhtml: typingsJapgolly.rdflib.rdflibStrings.textSlashhtml = "text/html".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.textSlashhtml]
    
    inline def textSlashn3: typingsJapgolly.rdflib.rdflibStrings.textSlashn3 = "text/n3".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.textSlashn3]
    
    inline def textSlashturtle: typingsJapgolly.rdflib.rdflibStrings.textSlashturtle = "text/turtle".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.textSlashturtle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.libTfTypesMod.Term
    - scala.Unit
    - scala.Null
    - typingsJapgolly.rdflib.libCollectionMod.default[C]
  */
  type FromValueReturns[C /* <: default */] = js.UndefOr[_FromValueReturns[C] | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.libDefaultGraphMod.default
    - typingsJapgolly.rdflib.libNamedNodeMod.default
    - typingsJapgolly.rdflib.libVariableMod.default
  */
  trait GraphType extends StObject
  
  @js.native
  trait IRDFlibDataFactory
    extends StObject
       with DataFactory[
          typingsJapgolly.rdflib.libNamedNodeMod.default | typingsJapgolly.rdflib.libBlankNodeMod.default | typingsJapgolly.rdflib.libLiteralMod.default | (typingsJapgolly.rdflib.libCollectionMod.default[
            default | typingsJapgolly.rdflib.libBlankNodeMod.default | typingsJapgolly.rdflib.libCollectionMod.Collection[Any] | typingsJapgolly.rdflib.libLiteralMod.default | typingsJapgolly.rdflib.libVariableMod.default
          ]) | (typingsJapgolly.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]), 
          Indexable
        ] {
    
    def fetcher(store: typingsJapgolly.rdflib.libStoreMod.default, options: Any): typingsJapgolly.rdflib.libFetcherMod.default = js.native
    
    def graph(): typingsJapgolly.rdflib.libStoreMod.default = js.native
    def graph(features: Any): typingsJapgolly.rdflib.libStoreMod.default = js.native
    def graph(features: Any, opts: Any): typingsJapgolly.rdflib.libStoreMod.default = js.native
    def graph(features: Unit, opts: Any): typingsJapgolly.rdflib.libStoreMod.default = js.native
    
    def lit(`val`: String): typingsJapgolly.rdflib.libLiteralMod.default = js.native
    def lit(`val`: String, lang: String): typingsJapgolly.rdflib.libLiteralMod.default = js.native
    def lit(`val`: String, lang: String, dt: typingsJapgolly.rdflib.libTfTypesMod.NamedNode): typingsJapgolly.rdflib.libLiteralMod.default = js.native
    def lit(`val`: String, lang: Unit, dt: typingsJapgolly.rdflib.libTfTypesMod.NamedNode): typingsJapgolly.rdflib.libLiteralMod.default = js.native
    
    def st(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typingsJapgolly.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType] = js.native
    def st(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): typingsJapgolly.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.libNamedNodeMod.default
    - typingsJapgolly.rdflib.libLiteralMod.default
    - typingsJapgolly.rdflib.libCollectionMod.default[
  typingsJapgolly.rdflib.libNodeInternalMod.default | typingsJapgolly.rdflib.libBlankNodeMod.default | typingsJapgolly.rdflib.libCollectionMod.Collection[scala.Any] | typingsJapgolly.rdflib.libLiteralMod.default | typingsJapgolly.rdflib.libVariableMod.default]
    - typingsJapgolly.rdflib.libBlankNodeMod.default
    - typingsJapgolly.rdflib.libVariableMod.default
    - typingsJapgolly.rdflib.libEmptyMod.default
  */
  type ObjectType = _ObjectType | (typingsJapgolly.rdflib.libCollectionMod.default[
    default | typingsJapgolly.rdflib.libBlankNodeMod.default | typingsJapgolly.rdflib.libCollectionMod.Collection[Any] | typingsJapgolly.rdflib.libLiteralMod.default | typingsJapgolly.rdflib.libVariableMod.default
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.libNamedNodeMod.default
    - typingsJapgolly.rdflib.libVariableMod.default
  */
  trait PredicateType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.libBlankNodeMod.default
    - typingsJapgolly.rdflib.libNamedNodeMod.default
    - typingsJapgolly.rdflib.libVariableMod.default
  */
  trait SubjectType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.rdflibStrings.NamedNode
    - typingsJapgolly.rdflib.rdflibStrings.BlankNode
    - typingsJapgolly.rdflib.rdflibStrings.Literal
    - typingsJapgolly.rdflib.rdflibStrings.Variable
    - typingsJapgolly.rdflib.rdflibStrings.DefaultGraph
    - typingsJapgolly.rdflib.rdflibStrings.Collection
    - typingsJapgolly.rdflib.rdflibStrings.Empty
    - typingsJapgolly.rdflib.rdflibStrings.Graph
  */
  trait TermType extends StObject
  object TermType {
    
    inline def BlankNode: typingsJapgolly.rdflib.rdflibStrings.BlankNode = "BlankNode".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.BlankNode]
    
    inline def Collection: typingsJapgolly.rdflib.rdflibStrings.Collection = "Collection".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.Collection]
    
    inline def DefaultGraph: typingsJapgolly.rdflib.rdflibStrings.DefaultGraph = "DefaultGraph".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.DefaultGraph]
    
    inline def Empty: typingsJapgolly.rdflib.rdflibStrings.Empty = "Empty".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.Empty]
    
    inline def Graph: typingsJapgolly.rdflib.rdflibStrings.Graph = "Graph".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.Graph]
    
    inline def Literal: typingsJapgolly.rdflib.rdflibStrings.Literal = "Literal".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.Literal]
    
    inline def NamedNode: typingsJapgolly.rdflib.rdflibStrings.NamedNode = "NamedNode".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.NamedNode]
    
    inline def Variable: typingsJapgolly.rdflib.rdflibStrings.Variable = "Variable".asInstanceOf[typingsJapgolly.rdflib.rdflibStrings.Variable]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.libTfTypesMod.Term
    - typingsJapgolly.rdflib.libNodeInternalMod.default
    - js.Date
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Unit
    - scala.Null
    - typingsJapgolly.rdflib.libCollectionMod.default[
  typingsJapgolly.rdflib.libNodeInternalMod.default | typingsJapgolly.rdflib.libBlankNodeMod.default | typingsJapgolly.rdflib.libCollectionMod.Collection[scala.Any] | typingsJapgolly.rdflib.libLiteralMod.default | typingsJapgolly.rdflib.libVariableMod.default]
  */
  type ValueType = js.UndefOr[
    _ValueType | (typingsJapgolly.rdflib.libCollectionMod.default[
      default | typingsJapgolly.rdflib.libBlankNodeMod.default | typingsJapgolly.rdflib.libCollectionMod.Collection[Any] | typingsJapgolly.rdflib.libLiteralMod.default | typingsJapgolly.rdflib.libVariableMod.default
    ]) | js.Date | String | Double | Boolean | Null
  ]
  
  trait _FromValueReturns[C /* <: default */] extends StObject
  
  trait _ObjectType extends StObject
  
  trait _ValueType extends StObject
}
