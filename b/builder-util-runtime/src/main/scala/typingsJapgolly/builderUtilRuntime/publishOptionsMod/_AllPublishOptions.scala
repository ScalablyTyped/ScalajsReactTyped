package typingsJapgolly.builderUtilRuntime.publishOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.AES256
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.REDUCED_REDUNDANCY
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.STANDARD
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.STANDARD_IA
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.`private`
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.`public-read`
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.awsColonkms
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.bintray
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.draft
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.generic
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.github
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.http
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.https
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.prerelease
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.release
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.s3
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.spaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AllPublishOptions extends js.Object

object _AllPublishOptions {
  @scala.inline
  def GithubOptions(
    provider: github,
    host: String = null,
    owner: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    protocol: https | http = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    releaseType: draft | prerelease | release = null,
    repo: String = null,
    token: String = null,
    updaterCacheDirName: String = null,
    vPrefixedTagName: js.UndefOr[Boolean] = js.undefined
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (releaseType != null) __obj.updateDynamic("releaseType")(releaseType.asInstanceOf[js.Any])
    if (repo != null) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    if (!js.isUndefined(vPrefixedTagName)) __obj.updateDynamic("vPrefixedTagName")(vPrefixedTagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def CustomPublishOptions(
    provider: PublishProvider,
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    updaterCacheDirName: String = null
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def SpacesOptions(
    name: String,
    provider: spaces,
    region: String,
    acl: `private` | `public-read` = null,
    channel: String = null,
    path: String = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    updaterCacheDirName: String = null
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def GenericServerOptions(
    provider: generic,
    url: String,
    channel: String = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    updaterCacheDirName: String = null,
    useMultipleRangeRequest: js.UndefOr[Boolean] = js.undefined
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    if (!js.isUndefined(useMultipleRangeRequest)) __obj.updateDynamic("useMultipleRangeRequest")(useMultipleRangeRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def S3Options(
    bucket: String,
    provider: s3,
    acl: `private` | `public-read` = null,
    channel: String = null,
    encryption: AES256 | awsColonkms = null,
    endpoint: String = null,
    path: String = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    region: String = null,
    storageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA = null,
    updaterCacheDirName: String = null
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
  @scala.inline
  def BintrayOptions(
    provider: bintray,
    _package: String = null,
    component: String = null,
    distribution: String = null,
    owner: String = null,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.Array[String] = null,
    repo: String = null,
    token: String = null,
    updaterCacheDirName: String = null,
    user: String = null
  ): _AllPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (repo != null) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (updaterCacheDirName != null) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AllPublishOptions]
  }
}

