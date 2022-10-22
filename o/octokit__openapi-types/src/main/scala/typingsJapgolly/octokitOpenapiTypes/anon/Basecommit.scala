package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.ahead
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.behind
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.diverged
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.identical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basecommit extends StObject {
  
  /** @example 4 */
  var ahead_by: Double
  
  var base_commit: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any
  
  /** @example 5 */
  var behind_by: Double
  
  var commits: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any
  ]
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/compare/master...topic.diff
    */
  var diff_url: String
  
  var files: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['diff-entry'] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/compare/master...topic
    */
  var html_url: String
  
  var merge_base_commit: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/compare/master...topic.patch
    */
  var patch_url: String
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/compare/octocat:bbcd538c8e72b8c175046e27cc8f907076331401...octocat:0328041d1152db8ae77652d1618a02e57f745f17
    */
  var permalink_url: String
  
  /**
    * @example ahead
    * @enum {string}
    */
  var status: diverged | ahead | behind | identical
  
  /** @example 6 */
  var total_commits: Double
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/compare/master...topic
    */
  var url: String
}
object Basecommit {
  
  inline def apply(
    ahead_by: Double,
    base_commit: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any,
    behind_by: Double,
    commits: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any
    ],
    diff_url: String,
    html_url: String,
    merge_base_commit: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any,
    patch_url: String,
    permalink_url: String,
    status: diverged | ahead | behind | identical,
    total_commits: Double,
    url: String
  ): Basecommit = {
    val __obj = js.Dynamic.literal(ahead_by = ahead_by.asInstanceOf[js.Any], base_commit = base_commit.asInstanceOf[js.Any], behind_by = behind_by.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], merge_base_commit = merge_base_commit.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], permalink_url = permalink_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_commits = total_commits.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basecommit]
  }
  
  extension [Self <: Basecommit](x: Self) {
    
    inline def setAhead_by(value: Double): Self = StObject.set(x, "ahead_by", value.asInstanceOf[js.Any])
    
    inline def setBase_commit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any
    ): Self = StObject.set(x, "base_commit", value.asInstanceOf[js.Any])
    
    inline def setBehind_by(value: Double): Self = StObject.set(x, "behind_by", value.asInstanceOf[js.Any])
    
    inline def setCommits(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any
        ]
    ): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setCommitsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any)*
    ): Self = StObject.set(x, "commits", js.Array(value*))
    
    inline def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
    
    inline def setFiles(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['diff-entry'] */ js.Any
        ]
    ): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['diff-entry'] */ js.Any)*
    ): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setMerge_base_commit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any
    ): Self = StObject.set(x, "merge_base_commit", value.asInstanceOf[js.Any])
    
    inline def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
    
    inline def setPermalink_url(value: String): Self = StObject.set(x, "permalink_url", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: diverged | ahead | behind | identical): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTotal_commits(value: Double): Self = StObject.set(x, "total_commits", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
