package typingsJapgolly.semanticRelease

import typingsJapgolly.semanticRelease.mod.Commit
import typingsJapgolly.semanticRelease.mod.LastRelease
import typingsJapgolly.semanticRelease.mod.NextRelease
import typingsJapgolly.semanticRelease.mod.Release
import typingsJapgolly.semanticRelease.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommits extends Result {
  /**
  		 * The list of commits included in the new release.
  		 */
  var commits: js.Array[Commit]
  /**
  		 * Information related to the last release found.
  		 */
  var lastRelease: LastRelease
  /**
  		 * Information related to the newly published release.
  		 */
  var nextRelease: NextRelease
  /**
  		 * The list of releases published, one release per publish plugin.
  		 */
  var releases: js.Array[Release]
}

object AnonCommits {
  @scala.inline
  def apply(
    commits: js.Array[Commit],
    lastRelease: LastRelease,
    nextRelease: NextRelease,
    releases: js.Array[Release]
  ): AnonCommits = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], nextRelease = nextRelease.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommits]
  }
}

