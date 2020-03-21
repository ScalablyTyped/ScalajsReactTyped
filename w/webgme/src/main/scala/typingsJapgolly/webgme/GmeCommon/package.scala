package typingsJapgolly.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeCommon {
  type ArtifactHash = java.lang.String
  type Aspect = java.lang.String
  type AttrMeta = js.Any
  type Buffer = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GLbyte */ js.Any
  ]
  type CatchCallback = typingsJapgolly.webgme.GmeCommon.ErrorOnlyCallback
  type Constraint = java.lang.String
  type Content = typingsJapgolly.webgme.GmeCommon.DataObject | typingsJapgolly.webgme.GmeCommon.Buffer | js.Array[typingsJapgolly.webgme.GmeCommon.Buffer]
  type ContentString = java.lang.String
  type CrosscutsInfo = typingsJapgolly.webgme.GmeCommon.Registry
  type DataObject = typingsJapgolly.webgme.Core.Node
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorOnlyCallback = js.Function1[/* err */ js.Error | scala.Null, scala.Unit]
  type ErrorStr = java.lang.String
  type ISO8601 = java.lang.String
  type InAttr = typingsJapgolly.webgme.GmeCommon.RegObj | typingsJapgolly.webgme.GmeCommon.Primitive | scala.Null
  /**
    * Callback for loadObject.
    *
    * @callback ProjectInterface~loadObjectCallback
    * @param {Error} err - If error occurred.
    * @param {module:Storage~CommitObject|module:Core~ObjectData} object - Object loaded from database, e.g. a commit object.
    */
  type LoadObject = typingsJapgolly.webgme.GmeStorage.CommitObject | typingsJapgolly.webgme.Core.DataObject
  type MemberId = typingsJapgolly.webgme.GmeCommon.Path
  type Metadata = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MetadataHash = java.lang.String
  type Name = java.lang.String
  type NodeId = java.lang.String
  type OutAttr = js.UndefOr[
    typingsJapgolly.webgme.GmeCommon.DataObject | typingsJapgolly.webgme.GmeCommon.Primitive | scala.Null
  ]
  type OutPath = js.UndefOr[java.lang.String | scala.Null]
  type Path = java.lang.String
  type Payload = java.lang.String | typingsJapgolly.webgme.GmeCommon.Buffer | js.Array[typingsJapgolly.webgme.GmeCommon.Buffer]
  type Primitive = java.lang.String | scala.Double
  type ProjectStart = java.lang.String | typingsJapgolly.webgme.GmeStorage.CommitHash | (js.Array[typingsJapgolly.webgme.GmeStorage.CommitHash | java.lang.String])
  type Registry = js.Any
  type RelId = java.lang.String
  type ResultCallback[T] = js.Function2[/* err */ js.Error | scala.Null, /* result */ T, scala.Unit]
  type SetId = java.lang.String
  type ThenCallback = typingsJapgolly.webgme.GmeCommon.VoidCallback
  type VoidCallback = js.Function0[scala.Unit]
  type VoidFn = js.Function0[scala.Unit]
}
