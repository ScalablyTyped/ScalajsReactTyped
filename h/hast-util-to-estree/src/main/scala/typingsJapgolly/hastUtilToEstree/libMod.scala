package typingsJapgolly.hastUtilToEstree

import typingsJapgolly.estree.mod.Directive
import typingsJapgolly.estree.mod.Expression
import typingsJapgolly.estree.mod.ModuleDeclaration
import typingsJapgolly.estree.mod.Program
import typingsJapgolly.estree.mod.Property
import typingsJapgolly.estree.mod.Statement
import typingsJapgolly.estreeJsx.mod.JSXAttribute
import typingsJapgolly.estreeJsx.mod.JSXElement
import typingsJapgolly.estreeJsx.mod.JSXExpressionContainer
import typingsJapgolly.estreeJsx.mod.JSXFragment
import typingsJapgolly.estreeJsx.mod.JSXOpeningElement
import typingsJapgolly.estreeJsx.mod.JSXSpreadAttribute
import typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.children
import typingsJapgolly.propertyInformation.libUtilSchemaMod.Schema
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("hast-util-to-estree/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toEstree(tree: MdxFlowExpression): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxFlowExpression, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttribute): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttributeValueExpression): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttributeValueExpression, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttribute, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxExpressionAttribute): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxExpressionAttribute, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxFlowElement): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxFlowElement, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxTextElement): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxTextElement, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxTextExpression): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxTextExpression, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: Node): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: Node, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  
  type Comment = typingsJapgolly.hast.mod.Comment
  
  type Content = typingsJapgolly.hast.mod.Content
  
  trait Context extends StObject {
    
    var comments: js.Array[EstreeComment]
    
    var esm: js.Array[EstreeDirective | EstreeStatement | EstreeModuleDeclaration]
    
    def handle(node: Any, context: Context): EstreeJsxChild | Null
    @JSName("handle")
    var handle_Original: Handle
    
    var schema: Schema
  }
  object Context {
    
    inline def apply(
      comments: js.Array[EstreeComment],
      esm: js.Array[EstreeDirective | EstreeStatement | EstreeModuleDeclaration],
      handle: (/* node */ Any, /* context */ Context) => EstreeJsxChild | Null,
      schema: Schema
    ): Context = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], esm = esm.asInstanceOf[js.Any], handle = js.Any.fromFunction2(handle), schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setComments(value: js.Array[EstreeComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsVarargs(value: EstreeComment*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setEsm(value: js.Array[EstreeDirective | EstreeStatement | EstreeModuleDeclaration]): Self = StObject.set(x, "esm", value.asInstanceOf[js.Any])
      
      inline def setEsmVarargs(value: (EstreeDirective | EstreeStatement | EstreeModuleDeclaration)*): Self = StObject.set(x, "esm", js.Array(value*))
      
      inline def setHandle(value: (/* node */ Any, /* context */ Context) => EstreeJsxChild | Null): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
      
      inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  type Element = typingsJapgolly.hast.mod.Element
  
  type EstreeComment = typingsJapgolly.estree.mod.Comment
  
  type EstreeDirective = Directive
  
  type EstreeExpression = Expression
  
  type EstreeJsxAttribute = JSXAttribute
  
  type EstreeJsxAttributeName = /* import warning: importer.ImportType#apply Failed type conversion: hast-util-to-estree.hast-util-to-estree/lib.EstreeJsxAttribute['name'] */ js.Any
  
  type EstreeJsxChild = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<estree.estree.BaseExpression>[number] */ js.Any
  
  type EstreeJsxElement = JSXElement
  
  /* Inlined hast-util-to-estree.hast-util-to-estree/lib.EstreeJsxOpeningElement['name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.`type`
    - typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.name
  */
  trait EstreeJsxElementName extends StObject
  object EstreeJsxElementName {
    
    inline def name: typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.name = "name".asInstanceOf[typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.name]
    
    inline def `type`: typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.`type` = "type".asInstanceOf[typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.`type`]
  }
  
  type EstreeJsxExpressionContainer = JSXExpressionContainer
  
  type EstreeJsxFragment = JSXFragment
  
  type EstreeJsxOpeningElement = JSXOpeningElement
  
  type EstreeJsxSpreadAttribute = JSXSpreadAttribute
  
  type EstreeModuleDeclaration = ModuleDeclaration
  
  type EstreeNode = typingsJapgolly.estree.mod.Node
  
  type EstreeProgram = Program
  
  type EstreeProperty = Property
  
  type EstreeStatement = Statement
  
  type Handle = js.Function2[/* node */ Any, /* context */ Context, EstreeJsxChild | Null]
  
  type JSXIdentifier = typingsJapgolly.estreeJsx.mod.JSXIdentifier
  
  type JSXMemberExpression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.JSXMemberExpression */ Any
  
  type MdxFlowExpression = typingsJapgolly.mdastUtilMdxExpression.mod.MdxFlowExpression
  
  type MdxJsxAttribute = typingsJapgolly.mdastUtilMdxJsx.mod.MdxJsxAttribute
  
  type MdxJsxAttributeValueExpression = typingsJapgolly.mdastUtilMdxJsx.mod.MdxJsxAttributeValueExpression
  
  type MdxJsxExpressionAttribute = typingsJapgolly.mdastUtilMdxJsx.mod.MdxJsxExpressionAttribute
  
  type MdxJsxFlowElement = typingsJapgolly.mdastUtilMdxJsx.mod.MdxJsxFlowElement
  
  type MdxJsxTextElement = typingsJapgolly.mdastUtilMdxJsx.mod.MdxJsxTextElement
  
  type MdxTextExpression = typingsJapgolly.mdastUtilMdxExpression.mod.MdxTextExpression
  
  type MdxjsEsm = typingsJapgolly.mdastUtilMdxjsEsm.mod.MdxjsEsm
  
  type Node = Root | Content
  
  trait Options extends StObject {
    
    var handlers: js.UndefOr[Record[String, Handle]] = js.undefined
    
    var space: js.UndefOr[Space] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHandlers(value: Record[String, Handle]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setSpace(value: Space): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  /* Inlined std.Extract<hast-util-to-estree.hast-util-to-estree/lib.Node, unist.unist.Parent<unist.unist.Node<unist.unist.Data>, unist.unist.NodeData<unist.unist.Node<unist.unist.Data>>>> */
  type Parent = children
  
  type Root = typingsJapgolly.hast.mod.Root
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.html
    - typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.svg
  */
  trait Space extends StObject
  object Space {
    
    inline def html: typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.html = "html".asInstanceOf[typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.html]
    
    inline def svg: typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.svg = "svg".asInstanceOf[typingsJapgolly.hastUtilToEstree.hastUtilToEstreeStrings.svg]
  }
  
  type Text = typingsJapgolly.hast.mod.Text
}
