package typingsJapgolly.glob.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.glob.AnonIsDirectory
import typingsJapgolly.glob.globBooleans.`false`
import typingsJapgolly.glob.globStrings.DIR
import typingsJapgolly.glob.globStrings.FILE
import typingsJapgolly.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob", "GlobSync")
@js.native
class GlobSync protected () extends IGlobBase {
  def this(pattern: String) = this()
  def this(pattern: String, options: IOptions) = this()
  /* CompleteClass */
  override var aborted: Boolean = js.native
  /* CompleteClass */
  override var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = js.native
  /* CompleteClass */
  override var found: js.Array[String] = js.native
  /* CompleteClass */
  override var minimatch: IMinimatch = js.native
  /* CompleteClass */
  override var options: IOptions = js.native
  /* CompleteClass */
  override var realpathCache: StringDictionary[String] = js.native
  /* CompleteClass */
  override var statCache: StringDictionary[js.UndefOr[`false` | AnonIsDirectory]] = js.native
  /* CompleteClass */
  override var symlinks: StringDictionary[js.UndefOr[Boolean]] = js.native
}

@JSImport("glob", "GlobSync")
@js.native
object GlobSync extends TopLevel[IGlobSyncStatic]

