package typingsJapgolly.rdfjsDataModel

import typingsJapgolly.rdfjsDataModel.rdfjsDataModelStrings.blankNode
import typingsJapgolly.rdfjsDataModel.rdfjsDataModelStrings.defaultGraph
import typingsJapgolly.rdfjsDataModel.rdfjsDataModelStrings.fromQuad
import typingsJapgolly.rdfjsDataModel.rdfjsDataModelStrings.fromTerm
import typingsJapgolly.rdfjsDataModel.rdfjsDataModelStrings.literal
import typingsJapgolly.rdfjsDataModel.rdfjsDataModelStrings.namedNode
import typingsJapgolly.rdfjsDataModel.rdfjsDataModelStrings.quad
import typingsJapgolly.rdfjsDataModel.rdfjsDataModelStrings.variable
import typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad
import typingsJapgolly.rdfjsTypes.dataModelMod.BlankNode
import typingsJapgolly.rdfjsTypes.dataModelMod.DefaultGraph
import typingsJapgolly.rdfjsTypes.dataModelMod.Literal
import typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode
import typingsJapgolly.rdfjsTypes.dataModelMod.Term
import typingsJapgolly.rdfjsTypes.dataModelMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@rdfjs/data-model/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DataFactory
  object default {
    
    /* static member */
    @JSImport("@rdfjs/data-model/Factory", "default.exports")
    @js.native
    val exports: js.Tuple8[blankNode, defaultGraph, fromQuad, fromTerm, literal, namedNode, quad, variable] = js.native
  }
  
  /* Inlined parent std.Required<@rdfjs/types.@rdfjs/types.DataFactory<@rdfjs/types.@rdfjs/types.BaseQuad, @rdfjs/types.@rdfjs/types.BaseQuad>> */
  @js.native
  trait DataFactory extends StObject {
    
    def blankNode(): BlankNode = js.native
    @JSName("blankNode")
    var blankNode_Original: js.Function0[BlankNode] = js.native
    
    def defaultGraph(): DefaultGraph = js.native
    @JSName("defaultGraph")
    var defaultGraph_Original: js.Function0[DefaultGraph] = js.native
    
    def fromQuad[T /* <: BaseQuad */](value: T): T = js.native
    
    def fromTerm(value: BaseQuad): BaseQuad = js.native
    def fromTerm(value: BlankNode): BlankNode = js.native
    def fromTerm(value: DefaultGraph): DefaultGraph = js.native
    def fromTerm(value: Literal): Literal = js.native
    def fromTerm(value: NamedNode[String]): NamedNode[String] = js.native
    def fromTerm(value: Variable): Variable = js.native
    
    def init(): Unit = js.native
    
    def literal(value: String): Literal = js.native
    @JSName("literal")
    var literal_Original: js.Function1[/* value */ String, Literal] = js.native
    
    def namedNode[Iri /* <: String */](value: Iri): NamedNode[Iri] = js.native
    @JSName("namedNode")
    var namedNode_Original: js.Function1[/* value */ String, NamedNode[String]] = js.native
    
    def quad(subject: Term, predicate: Term, `object`: Term): BaseQuad = js.native
    def quad[Q /* <: BaseQuad */](
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ): Q = js.native
    def quad[Q /* <: BaseQuad */](
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
      graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any
    ): Q = js.native
    @JSName("quad")
    var quad_Original: js.Function3[/* subject */ Term, /* predicate */ Term, /* object */ Term, BaseQuad] = js.native
    
    def variable(value: String): Variable = js.native
    @JSName("variable")
    var variable_Original: js.Function1[/* value */ String, Variable] = js.native
  }
}
