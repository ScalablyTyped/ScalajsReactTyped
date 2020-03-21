package typingsJapgolly.pulumiCloud.serviceMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  /**
    * Either a path to a folder in which a Docker build should be run to construct the image for this
    * Container, or a ContainerBuild object with more detailed build instructions.  If `image` is also specified, the
    * built container will be tagged with that name, but otherwise will get an auto-generated image name.
    */
  var build: js.UndefOr[String | ContainerBuild] = js.undefined
  /**
    * The command line that is passed to the container. This parameter maps to
    * `Cmd` in the [Create a
    * container](https://docs.docker.com/engine/reference/api/docker_remote_api_v1.19/#create-a-container)
    * section of the [Docker Remote
    * API](https://docs.docker.com/engine/reference/api/docker_remote_api_v1.19/)
    * and the `COMMAND` parameter to [docker run](https://docs.docker.com/engine/reference/commandline/run/). For more
    * information about the Docker `CMD` parameter, go to
    * https://docs.docker.com/engine/reference/builder/#cmd.
    */
  var command: js.UndefOr[Input[js.Array[String]]] = js.undefined
  /**
    * Number of CPUs for the container to use. Maps to the Docker `--cpus` option - see
    * https://docs.docker.com/engine/reference/commandline/run.
    */
  var cpu: js.UndefOr[Input[Double]] = js.undefined
  /**
    * A key/value map of labels to add to the container. This parameter maps to Labels in the [Create a
    * container](https://docs.docker.com/engine/api/v1.27/#operation/ContainerCreate) section of the [Docker Remote
    * API](https://docs.docker.com/engine/api/v1.27/) and the --label option to [docker
    * run](https://docs.docker.com/engine/reference/run/).
    */
  var dockerLabels: js.UndefOr[Input[StringDictionary[String]]] = js.undefined
  /**
    * Optional environment variables to set and make available to the container
    * as it is running.
    */
  var environment: js.UndefOr[StringDictionary[Input[String]]] = js.undefined
  /**
    * The function code to use as the implementation of the contaner.  If `function` is specified,
    * neither `image` nor `build` are legal.
    */
  var function: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The image to use for the container.  If `image` is specified, but not `build`, the image will be
    * pulled from the Docker Hub.  If `image` *and* `build` are specified, the `image` controls the
    * resulting image tag for the build image that gets pushed.
    */
  var image: js.UndefOr[Input[String]] = js.undefined
  /**
    * The maximum amount of memory the container will be allowed to use. Maps to the Docker
    * `--memory` option - see
    * https://docs.docker.com/engine/reference/commandline/run.
    *
    * This should be supplied in MB. i.e. A value of 1024 would equal one gigabyte.
    */
  var memory: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The amount of memory to reserve for the container, but the container will
    * be allowed to use more memory if it's available.  At least one of
    * `memory` and `memoryReservation` must be specified.  Maps to the Docker
    * `--memory-reservation` option - see
    * https://docs.docker.com/engine/reference/commandline/run.
    *
    * This should be supplied in MB. i.e. A value of 1024 would equal one gigabyte.
    */
  var memoryReservation: js.UndefOr[Input[Double]] = js.undefined
  /**
    * An array of ports to publish from the container.  Ports are exposed using the TCP protocol.  If the [external]
    * flag is true, the port will be exposed to the Internet even if the service is running in a private network.
    * Maps to the Docker `--publish` option - see
    * https://docs.docker.com/engine/reference/commandline/run.
    */
  var ports: js.UndefOr[js.Array[ContainerPort]] = js.undefined
  /**
    * An array of volume mounts, indicating a volume to mount and a path within
    * the container at which to mount the volume.  Maps to the Docker
    * `--volume` option - see
    * https://docs.docker.com/engine/reference/commandline/run.
    */
  var volumes: js.UndefOr[js.Array[ContainerVolumeMount]] = js.undefined
}

object Container {
  @scala.inline
  def apply(
    build: String | ContainerBuild = null,
    command: Input[js.Array[String]] = null,
    cpu: Input[Double] = null,
    dockerLabels: Input[StringDictionary[String]] = null,
    environment: StringDictionary[Input[String]] = null,
    function: js.UndefOr[Callback] = js.undefined,
    image: Input[String] = null,
    memory: Input[Double] = null,
    memoryReservation: Input[Double] = null,
    ports: js.Array[ContainerPort] = null,
    volumes: js.Array[ContainerVolumeMount] = null
  ): Container = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (dockerLabels != null) __obj.updateDynamic("dockerLabels")(dockerLabels.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    function.foreach(p => __obj.updateDynamic("function")(p.toJsFn))
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (memoryReservation != null) __obj.updateDynamic("memoryReservation")(memoryReservation.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

