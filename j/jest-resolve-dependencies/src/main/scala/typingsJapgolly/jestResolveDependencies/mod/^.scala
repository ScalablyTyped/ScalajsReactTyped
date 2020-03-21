package typingsJapgolly.jestResolveDependencies.mod

import typingsJapgolly.jestHasteMap.mod.FS
import typingsJapgolly.jestSnapshot.mod.SnapshotResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DependencyResolver is used to resolve the direct dependencies of a module or
  * to retrieve a list of all transitive inverse dependencies.
  */
@JSImport("jest-resolve-dependencies", JSImport.Namespace)
@js.native
class ^ protected () extends DependencyResolver {
  def this(resolver: typingsJapgolly.jestResolve.mod.^, hasteFS: FS, snapshotResolver: SnapshotResolver) = this()
}

