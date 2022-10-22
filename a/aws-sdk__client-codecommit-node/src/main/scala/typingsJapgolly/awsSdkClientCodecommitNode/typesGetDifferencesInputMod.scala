package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetDifferencesInputMod {
  
  trait GetDifferencesInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A non-negative integer used to limit the number of returned results.</p>
      */
    var MaxResults: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>An enumeration token that when provided in a request, returns the next batch of the results.</p>
      */
    var NextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The branch, tag, HEAD, or other fully qualified reference used to identify a commit.</p>
      */
    var afterCommitSpecifier: String
    
    /**
      * <p>The file path in which to check differences. Limits the results to this path. Can also be used to specify the changed name of a directory or folder, if it has changed. If not specified, differences will be shown for all paths.</p>
      */
    var afterPath: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full commit ID. Optional. If not specified, all changes prior to the <code>afterCommitSpecifier</code> value will be shown. If you do not use <code>beforeCommitSpecifier</code> in your request, consider limiting the results with <code>maxResults</code>.</p>
      */
    var beforeCommitSpecifier: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The file path in which to check for differences. Limits the results to this path. Can also be used to specify the previous name of a directory or folder. If <code>beforePath</code> and <code>afterPath</code> are not specified, differences will be shown for all paths.</p>
      */
    var beforePath: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the repository where you want to get differences.</p>
      */
    var repositoryName: String
  }
  object GetDifferencesInput {
    
    inline def apply(afterCommitSpecifier: String, repositoryName: String): GetDifferencesInput = {
      val __obj = js.Dynamic.literal(afterCommitSpecifier = afterCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDifferencesInput]
    }
    
    extension [Self <: GetDifferencesInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setAfterCommitSpecifier(value: String): Self = StObject.set(x, "afterCommitSpecifier", value.asInstanceOf[js.Any])
      
      inline def setAfterPath(value: String): Self = StObject.set(x, "afterPath", value.asInstanceOf[js.Any])
      
      inline def setAfterPathUndefined: Self = StObject.set(x, "afterPath", js.undefined)
      
      inline def setBeforeCommitSpecifier(value: String): Self = StObject.set(x, "beforeCommitSpecifier", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommitSpecifierUndefined: Self = StObject.set(x, "beforeCommitSpecifier", js.undefined)
      
      inline def setBeforePath(value: String): Self = StObject.set(x, "beforePath", value.asInstanceOf[js.Any])
      
      inline def setBeforePathUndefined: Self = StObject.set(x, "beforePath", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
