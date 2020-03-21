package typingsJapgolly.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aclMod {
  type AddAclCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* acl */ js.UndefOr[typingsJapgolly.googleCloudStorage.aclMod.AccessControlObject | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type AddAclResponse = js.Tuple2[
    typingsJapgolly.googleCloudStorage.aclMod.AccessControlObject, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type GetAclCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* acl */ js.UndefOr[
      typingsJapgolly.googleCloudStorage.aclMod.AccessControlObject | js.Array[typingsJapgolly.googleCloudStorage.aclMod.AccessControlObject] | scala.Null
    ], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetAclResponse = js.Tuple2[
    typingsJapgolly.googleCloudStorage.aclMod.AccessControlObject | js.Array[typingsJapgolly.googleCloudStorage.aclMod.AccessControlObject], 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type RemoveAclCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type RemoveAclResponse = js.Array[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata]
  type UpdateAclCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* acl */ js.UndefOr[typingsJapgolly.googleCloudStorage.aclMod.AccessControlObject | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type UpdateAclResponse = js.Tuple2[
    typingsJapgolly.googleCloudStorage.aclMod.AccessControlObject, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
