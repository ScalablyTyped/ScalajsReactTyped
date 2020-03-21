package typingsJapgolly.cssTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnterOrLeaveFn[NodeType] = js.ThisFunction3[
    /* this */ typingsJapgolly.cssTree.mod.WalkContext, 
    /* node */ NodeType, 
    /* item */ typingsJapgolly.cssTree.mod.ListItem[typingsJapgolly.cssTree.mod.CssNode], 
    /* list */ typingsJapgolly.cssTree.mod.List[typingsJapgolly.cssTree.mod.CssNode], 
    scala.Unit
  ]
  type FilterFn[TData, TResult /* <: TData */, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ typingsJapgolly.cssTree.mod.ListItem[TData], 
    /* list */ typingsJapgolly.cssTree.mod.List[TData], 
    /* is TResult */ scala.Boolean
  ]
  type FindFn = js.ThisFunction3[
    /* this */ typingsJapgolly.cssTree.mod.WalkContext, 
    /* node */ typingsJapgolly.cssTree.mod.CssNode, 
    /* item */ typingsJapgolly.cssTree.mod.ListItem[typingsJapgolly.cssTree.mod.CssNode], 
    /* list */ typingsJapgolly.cssTree.mod.List[typingsJapgolly.cssTree.mod.CssNode], 
    scala.Boolean
  ]
  type IteratorFn[TData, TResult, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ typingsJapgolly.cssTree.mod.ListItem[TData], 
    /* list */ typingsJapgolly.cssTree.mod.List[TData], 
    TResult
  ]
  type WalkOptions = (typingsJapgolly.cssTree.mod.WalkOptionsVisit[
    typingsJapgolly.cssTree.mod.AnPlusB | typingsJapgolly.cssTree.mod.Atrule | typingsJapgolly.cssTree.mod.AtrulePrelude | typingsJapgolly.cssTree.mod.AttributeSelector | typingsJapgolly.cssTree.mod.Block | typingsJapgolly.cssTree.mod.Brackets | typingsJapgolly.cssTree.mod.CDC | typingsJapgolly.cssTree.mod.CDO | typingsJapgolly.cssTree.mod.ClassSelector | typingsJapgolly.cssTree.mod.Combinator | typingsJapgolly.cssTree.mod.Comment | typingsJapgolly.cssTree.mod.Declaration | typingsJapgolly.cssTree.mod.DeclarationList | typingsJapgolly.cssTree.mod.Dimension | typingsJapgolly.cssTree.mod.FunctionNode | typingsJapgolly.cssTree.mod.HexColor | typingsJapgolly.cssTree.mod.IdSelector | typingsJapgolly.cssTree.mod.Identifier | typingsJapgolly.cssTree.mod.MediaFeature | typingsJapgolly.cssTree.mod.MediaQuery | typingsJapgolly.cssTree.mod.MediaQueryList | typingsJapgolly.cssTree.mod.Nth | typingsJapgolly.cssTree.mod.NumberNode | typingsJapgolly.cssTree.mod.Operator | typingsJapgolly.cssTree.mod.Parentheses | typingsJapgolly.cssTree.mod.Percentage | typingsJapgolly.cssTree.mod.PseudoClassSelector | typingsJapgolly.cssTree.mod.PseudoElementSelector | typingsJapgolly.cssTree.mod.Ratio | typingsJapgolly.cssTree.mod.Raw | typingsJapgolly.cssTree.mod.Rule | typingsJapgolly.cssTree.mod.Selector | typingsJapgolly.cssTree.mod.SelectorList | typingsJapgolly.cssTree.mod.StringNode | typingsJapgolly.cssTree.mod.StyleSheet | typingsJapgolly.cssTree.mod.TypeSelector | typingsJapgolly.cssTree.mod.UnicodeRange | typingsJapgolly.cssTree.mod.Url | typingsJapgolly.cssTree.mod.Value | typingsJapgolly.cssTree.mod.WhiteSpace
  ]) | typingsJapgolly.cssTree.mod.WalkOptionsNoVisit
}
