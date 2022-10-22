package typingsJapgolly.angularDevkitSchematics.mod

import typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.FilePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeConstructor extends StObject {
  
  def branch(tree: typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree): typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree = js.native
  
  def empty(): typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree = js.native
  
  def merge(
    tree: typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree,
    other: typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree
  ): typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree = js.native
  def merge(
    tree: typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree,
    other: typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree,
    strategy: typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy
  ): typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree = js.native
  
  def optimize(tree: typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree): typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree = js.native
  
  def partition(
    tree: typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree,
    predicate: FilePredicate[Boolean]
  ): js.Tuple2[
    typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree, 
    typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree
  ] = js.native
}
