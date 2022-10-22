package typingsJapgolly.slate

import typingsJapgolly.slate.distInterfacesEditorMod.Editor
import typingsJapgolly.slate.distInterfacesElementMod.Element
import typingsJapgolly.slate.distInterfacesElementMod.ElementEntry
import typingsJapgolly.slate.distInterfacesPathMod.Path
import typingsJapgolly.slate.distInterfacesRangeMod.Range
import typingsJapgolly.slate.distInterfacesTextMod.Text
import typingsJapgolly.slate.slateStrings.children
import typingsJapgolly.slate.slateStrings.text_
import typingsJapgolly.std.Generator
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesNodeMod {
  
  @JSImport("slate/dist/interfaces/node", "Node")
  @js.native
  val Node: NodeInterface = js.native
  type Node = Editor | Element | Text
  
  type Ancestor = Editor | Element
  
  type BaseNode = Editor | Element | Text
  
  type Descendant = Element | Text
  
  trait NodeAncestorsOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object NodeAncestorsOptions {
    
    inline def apply(): NodeAncestorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeAncestorsOptions]
    }
    
    extension [Self <: NodeAncestorsOptions](x: Self) {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  trait NodeChildrenOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object NodeChildrenOptions {
    
    inline def apply(): NodeChildrenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeChildrenOptions]
    }
    
    extension [Self <: NodeChildrenOptions](x: Self) {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  trait NodeDescendantsOptions extends StObject {
    
    var from: js.UndefOr[Path] = js.undefined
    
    var pass: js.UndefOr[
        js.Function1[/* node */ NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node], Boolean]
      ] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[Path] = js.undefined
  }
  object NodeDescendantsOptions {
    
    inline def apply(): NodeDescendantsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDescendantsOptions]
    }
    
    extension [Self <: NodeDescendantsOptions](x: Self) {
      
      inline def setFrom(value: Path): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setPass(value: /* node */ NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node] => Boolean): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  trait NodeElementsOptions extends StObject {
    
    var from: js.UndefOr[Path] = js.undefined
    
    var pass: js.UndefOr[
        js.Function1[/* node */ NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node], Boolean]
      ] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[Path] = js.undefined
  }
  object NodeElementsOptions {
    
    inline def apply(): NodeElementsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeElementsOptions]
    }
    
    extension [Self <: NodeElementsOptions](x: Self) {
      
      inline def setFrom(value: Path): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setPass(value: /* node */ NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node] => Boolean): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  type NodeEntry[T /* <: typingsJapgolly.slate.distInterfacesNodeMod.Node */] = js.Tuple2[T, Path]
  
  @js.native
  trait NodeInterface extends StObject {
    
    def ancestor(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): Ancestor = js.native
    
    def ancestors(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): Generator[NodeEntry[Ancestor], Unit, Unit] = js.native
    def ancestors(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path, options: NodeAncestorsOptions): Generator[NodeEntry[Ancestor], Unit, Unit] = js.native
    
    def child(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, index: Double): Descendant = js.native
    
    def children(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): Generator[NodeEntry[Descendant], Unit, Unit] = js.native
    def children(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path, options: NodeChildrenOptions): Generator[NodeEntry[Descendant], Unit, Unit] = js.native
    
    def common(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path, another: Path): NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node] = js.native
    
    def descendant(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): Descendant = js.native
    
    def descendants(root: typingsJapgolly.slate.distInterfacesNodeMod.Node): Generator[NodeEntry[Descendant], Unit, Unit] = js.native
    def descendants(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, options: NodeDescendantsOptions): Generator[NodeEntry[Descendant], Unit, Unit] = js.native
    
    def elements(root: typingsJapgolly.slate.distInterfacesNodeMod.Node): Generator[ElementEntry, Unit, Unit] = js.native
    def elements(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, options: NodeElementsOptions): Generator[ElementEntry, Unit, Unit] = js.native
    
    def extractProps(node: typingsJapgolly.slate.distInterfacesNodeMod.Node): NodeProps = js.native
    
    def first(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node] = js.native
    
    def fragment(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, range: Range): js.Array[Descendant] = js.native
    
    def get(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): typingsJapgolly.slate.distInterfacesNodeMod.Node = js.native
    
    def has(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): Boolean = js.native
    
    def isNode(value: Any): /* is slate.slate/dist/interfaces/node.Node */ Boolean = js.native
    
    def isNodeList(value: Any): /* is std.Array<slate.slate/dist/interfaces/node.Node> */ Boolean = js.native
    
    def last(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node] = js.native
    
    def leaf(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): Text = js.native
    
    def levels(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): Generator[NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node], Unit, Unit] = js.native
    def levels(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path, options: NodeLevelsOptions): Generator[NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node], Unit, Unit] = js.native
    
    def matches(
      node: typingsJapgolly.slate.distInterfacesNodeMod.Node,
      props: Partial[typingsJapgolly.slate.distInterfacesNodeMod.Node]
    ): Boolean = js.native
    
    def nodes(root: typingsJapgolly.slate.distInterfacesNodeMod.Node): Generator[NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node], Unit, Unit] = js.native
    def nodes(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, options: NodeNodesOptions): Generator[NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node], Unit, Unit] = js.native
    
    def parent(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, path: Path): Ancestor = js.native
    
    def string(node: typingsJapgolly.slate.distInterfacesNodeMod.Node): String = js.native
    
    def texts(root: typingsJapgolly.slate.distInterfacesNodeMod.Node): Generator[NodeEntry[Text], Unit, Unit] = js.native
    def texts(root: typingsJapgolly.slate.distInterfacesNodeMod.Node, options: NodeTextsOptions): Generator[NodeEntry[Text], Unit, Unit] = js.native
  }
  
  trait NodeLevelsOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object NodeLevelsOptions {
    
    inline def apply(): NodeLevelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeLevelsOptions]
    }
    
    extension [Self <: NodeLevelsOptions](x: Self) {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  trait NodeNodesOptions extends StObject {
    
    var from: js.UndefOr[Path] = js.undefined
    
    var pass: js.UndefOr[
        js.Function1[/* entry */ NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node], Boolean]
      ] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[Path] = js.undefined
  }
  object NodeNodesOptions {
    
    inline def apply(): NodeNodesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeNodesOptions]
    }
    
    extension [Self <: NodeNodesOptions](x: Self) {
      
      inline def setFrom(value: Path): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setPass(value: /* entry */ NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node] => Boolean): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  type NodeProps = Omit[Editor | Element | Text, children | text_]
  
  trait NodeTextsOptions extends StObject {
    
    var from: js.UndefOr[Path] = js.undefined
    
    var pass: js.UndefOr[
        js.Function1[/* node */ NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node], Boolean]
      ] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[Path] = js.undefined
  }
  object NodeTextsOptions {
    
    inline def apply(): NodeTextsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeTextsOptions]
    }
    
    extension [Self <: NodeTextsOptions](x: Self) {
      
      inline def setFrom(value: Path): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setPass(value: /* node */ NodeEntry[typingsJapgolly.slate.distInterfacesNodeMod.Node] => Boolean): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
}
