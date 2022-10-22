package typingsJapgolly.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sarif.mod.Artifact.roles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifact extends StObject {
  
  /**
    * The contents of the artifact.
    */
  var contents: js.UndefOr[ArtifactContent] = js.undefined
  
  /**
    * A short description of the artifact.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * Specifies the encoding for an artifact object that refers to a text file.
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of
    * the artifact produced by the specified hash function.
    */
  var hashes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The Coordinated Universal Time (UTC) date and time at which the artifact was most recently modified. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastModifiedTimeUtc: js.UndefOr[String] = js.undefined
  
  /**
    * The length of the artifact in bytes.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The location of the artifact.
    */
  var location: js.UndefOr[ArtifactLocation] = js.undefined
  
  /**
    * The MIME type (RFC 2045) of the artifact.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * The offset in bytes of the artifact within its containing artifact.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies the index of the immediate parent of the artifact, if this artifact is nested.
    */
  var parentIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the artifact.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The role or roles played by the artifact in the analysis.
    */
  var roles: js.UndefOr[js.Array[roles]] = js.undefined
  
  /**
    * Specifies the source language for any artifact object that refers to a text file that contains source code.
    */
  var sourceLanguage: js.UndefOr[String] = js.undefined
}
object Artifact {
  
  inline def apply(): Artifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact]
  }
  
  extension [Self <: Artifact](x: Self) {
    
    inline def setContents(value: ArtifactContent): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHashes(value: StringDictionary[String]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    inline def setLastModifiedTimeUtc(value: String): Self = StObject.set(x, "lastModifiedTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUtcUndefined: Self = StObject.set(x, "lastModifiedTimeUtc", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLocation(value: ArtifactLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setParentIndex(value: Double): Self = StObject.set(x, "parentIndex", value.asInstanceOf[js.Any])
    
    inline def setParentIndexUndefined: Self = StObject.set(x, "parentIndex", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRoles(value: js.Array[roles]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: roles*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setSourceLanguage(value: String): Self = StObject.set(x, "sourceLanguage", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageUndefined: Self = StObject.set(x, "sourceLanguage", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sarif.sarifStrings.analysisTarget
    - typingsJapgolly.sarif.sarifStrings.attachment
    - typingsJapgolly.sarif.sarifStrings.responseFile
    - typingsJapgolly.sarif.sarifStrings.resultFile
    - typingsJapgolly.sarif.sarifStrings.standardStream
    - typingsJapgolly.sarif.sarifStrings.tracedFile
    - typingsJapgolly.sarif.sarifStrings.unmodified
    - typingsJapgolly.sarif.sarifStrings.modified
    - typingsJapgolly.sarif.sarifStrings.added
    - typingsJapgolly.sarif.sarifStrings.deleted
    - typingsJapgolly.sarif.sarifStrings.renamed
    - typingsJapgolly.sarif.sarifStrings.uncontrolled
    - typingsJapgolly.sarif.sarifStrings.driver
    - typingsJapgolly.sarif.sarifStrings.`extension`
    - typingsJapgolly.sarif.sarifStrings.translation
    - typingsJapgolly.sarif.sarifStrings.taxonomy
    - typingsJapgolly.sarif.sarifStrings.policy
    - typingsJapgolly.sarif.sarifStrings.referencedOnCommandLine
    - typingsJapgolly.sarif.sarifStrings.memoryContents
    - typingsJapgolly.sarif.sarifStrings.directory
    - typingsJapgolly.sarif.sarifStrings.userSpecifiedConfiguration
    - typingsJapgolly.sarif.sarifStrings.toolSpecifiedConfiguration
    - typingsJapgolly.sarif.sarifStrings.debugOutputFile
  */
  trait roles extends StObject
  object roles {
    
    inline def added: typingsJapgolly.sarif.sarifStrings.added = "added".asInstanceOf[typingsJapgolly.sarif.sarifStrings.added]
    
    inline def analysisTarget: typingsJapgolly.sarif.sarifStrings.analysisTarget = "analysisTarget".asInstanceOf[typingsJapgolly.sarif.sarifStrings.analysisTarget]
    
    inline def attachment: typingsJapgolly.sarif.sarifStrings.attachment = "attachment".asInstanceOf[typingsJapgolly.sarif.sarifStrings.attachment]
    
    inline def debugOutputFile: typingsJapgolly.sarif.sarifStrings.debugOutputFile = "debugOutputFile".asInstanceOf[typingsJapgolly.sarif.sarifStrings.debugOutputFile]
    
    inline def deleted: typingsJapgolly.sarif.sarifStrings.deleted = "deleted".asInstanceOf[typingsJapgolly.sarif.sarifStrings.deleted]
    
    inline def directory: typingsJapgolly.sarif.sarifStrings.directory = "directory".asInstanceOf[typingsJapgolly.sarif.sarifStrings.directory]
    
    inline def driver: typingsJapgolly.sarif.sarifStrings.driver = "driver".asInstanceOf[typingsJapgolly.sarif.sarifStrings.driver]
    
    inline def `extension`: typingsJapgolly.sarif.sarifStrings.`extension` = "extension".asInstanceOf[typingsJapgolly.sarif.sarifStrings.`extension`]
    
    inline def memoryContents: typingsJapgolly.sarif.sarifStrings.memoryContents = "memoryContents".asInstanceOf[typingsJapgolly.sarif.sarifStrings.memoryContents]
    
    inline def modified: typingsJapgolly.sarif.sarifStrings.modified = "modified".asInstanceOf[typingsJapgolly.sarif.sarifStrings.modified]
    
    inline def policy: typingsJapgolly.sarif.sarifStrings.policy = "policy".asInstanceOf[typingsJapgolly.sarif.sarifStrings.policy]
    
    inline def referencedOnCommandLine: typingsJapgolly.sarif.sarifStrings.referencedOnCommandLine = "referencedOnCommandLine".asInstanceOf[typingsJapgolly.sarif.sarifStrings.referencedOnCommandLine]
    
    inline def renamed: typingsJapgolly.sarif.sarifStrings.renamed = "renamed".asInstanceOf[typingsJapgolly.sarif.sarifStrings.renamed]
    
    inline def responseFile: typingsJapgolly.sarif.sarifStrings.responseFile = "responseFile".asInstanceOf[typingsJapgolly.sarif.sarifStrings.responseFile]
    
    inline def resultFile: typingsJapgolly.sarif.sarifStrings.resultFile = "resultFile".asInstanceOf[typingsJapgolly.sarif.sarifStrings.resultFile]
    
    inline def standardStream: typingsJapgolly.sarif.sarifStrings.standardStream = "standardStream".asInstanceOf[typingsJapgolly.sarif.sarifStrings.standardStream]
    
    inline def taxonomy: typingsJapgolly.sarif.sarifStrings.taxonomy = "taxonomy".asInstanceOf[typingsJapgolly.sarif.sarifStrings.taxonomy]
    
    inline def toolSpecifiedConfiguration: typingsJapgolly.sarif.sarifStrings.toolSpecifiedConfiguration = "toolSpecifiedConfiguration".asInstanceOf[typingsJapgolly.sarif.sarifStrings.toolSpecifiedConfiguration]
    
    inline def tracedFile: typingsJapgolly.sarif.sarifStrings.tracedFile = "tracedFile".asInstanceOf[typingsJapgolly.sarif.sarifStrings.tracedFile]
    
    inline def translation: typingsJapgolly.sarif.sarifStrings.translation = "translation".asInstanceOf[typingsJapgolly.sarif.sarifStrings.translation]
    
    inline def uncontrolled: typingsJapgolly.sarif.sarifStrings.uncontrolled = "uncontrolled".asInstanceOf[typingsJapgolly.sarif.sarifStrings.uncontrolled]
    
    inline def unmodified: typingsJapgolly.sarif.sarifStrings.unmodified = "unmodified".asInstanceOf[typingsJapgolly.sarif.sarifStrings.unmodified]
    
    inline def userSpecifiedConfiguration: typingsJapgolly.sarif.sarifStrings.userSpecifiedConfiguration = "userSpecifiedConfiguration".asInstanceOf[typingsJapgolly.sarif.sarifStrings.userSpecifiedConfiguration]
  }
}
