package typingsJapgolly.conventionalChangelogWriter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GeneratedContext[TCommit /* <: typingsJapgolly.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typingsJapgolly.conventionalChangelogWriter.mod.Context */] = TContext with typingsJapgolly.conventionalChangelogWriter.mod.TransformedCommit[TCommit] with typingsJapgolly.conventionalChangelogWriter.mod.GeneratedContext.ExtraContext[TCommit]
  type Omit[T, K /* <: java.lang.String | scala.Double | js.Symbol */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, K> ]: T[P]}
    */ typingsJapgolly.conventionalChangelogWriter.conventionalChangelogWriterStrings.Omit with T
  type Options[TCommit /* <: typingsJapgolly.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typingsJapgolly.conventionalChangelogWriter.mod.Context */] = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias conventional-changelog-writer.conventional-changelog-writer.Options<TCommit, TContext> */ js.Object
  type TransformedCommit[T /* <: typingsJapgolly.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */] = (typingsJapgolly.conventionalChangelogWriter.mod.Omit[
    T, 
    typingsJapgolly.conventionalChangelogWriter.conventionalChangelogWriterStrings.raw
  ]) with typingsJapgolly.conventionalChangelogWriter.AnonRaw[T]
}
