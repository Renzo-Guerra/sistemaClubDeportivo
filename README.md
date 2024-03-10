# Sistema club deportivo

El club social y deportivo Calamuchita Jr. nos ha encargado desarrollar un sistema que permita
gestionar sus canchas de fútbol, tenis y bochas.

Cuando un deportista desea reservar una cancha, debe indicar tipo de cancha, día y horarioDisponible en el cual desea
reservar.

El sistema, entonces verificará que la cancha se encuentra disponible en ese día y horarioDisponible. Si así fuese, el
sistema solicitará al deportista que informe quién va a ser el responsable del pago (nombre apellido DNI), sus datos
de tarjeta de crédito (número de tarjeta de crédito, fecha de vencimiento y código de seguridad).

El sistema
entonces validará la información de la tarjeta de crédito interactuando con el sistema bancario. En caso de ser
correctos, el sistema asignará el turno e informará el monto a pagar. Sin embargo, el cobro recién será efectuado al
finalizar el turno reservado. Una vez realizada la reserva, el sistema mostrará el día y la hora de la reserva y las
características de la cancha reservada (el deporte de dicha cancha, ubicación en el predio de la cancha, cantidad de
deportistas para la cancha; y días, horarios y duración del turno de esa cancha). Si no hay disponibilidad en el día y
horarioDisponible deseado por el deportista, el sistema informa de la situación.

Por otra parte, el sistema también permitirá, al deportista, visualizar un calendario de los próximos 7 días,
detallando los turnos libres por cada cancha de cada deporte. Al visualizar este calendario, el sistema brindará al
deportista la posibilidad de realizar una reserva de una cancha en un día y fecha disponible.

Como es frecuente que los deportistas tengan lesiones (o un partido de PlayStation impostergable) y no puedan
asistir al turno, el sistema brindará la posibilidad de cancelar una reserva hasta 12 horas antes.
Cuando el deportista avisa antes del turno asignado, el sistema elimina la reserva y deja disponible la cancha en dicho horarioDisponible.
Igualmente, para evitar que los deportistas se abusen de esta “característica”, la cancelación será penalizada
monetariamente. Actualmente, el pago de la penalización es del 10% del monto del turno. En el momento de la
cancelación el sistema deberá realizar el cobro automáticamente. En caso de que los deportistas no cancelen la
reserva y no se presenten al turno asignado, el “canchero” deberá informar esta situación y el sistema cobrará el
50% del monto. Cuando un turno se desarrolle con normalidad, es decir, que los deportistas se presenten, el cargo
se cobrará automáticamente a la tarjeta de crédito un minuto después de haber finalizado el turno. En todos los
casos, los cobros se realizarán interactuando con el sistema bancario.

Debido a que el club está en continuo crecimiento, cuando se termina de construir una cancha de algún deporte es
posible ofrecer esa cancha para usar. Para ello, el sistema solicita al “canchero” el deporte de dicha cancha,
ubicación en el predio de la cancha, cantidad de deportistas para la cancha; y días, horarios y duración del turno de
esa cancha.

El sistema deberá permitir al deportista ver las características de una cancha en particular, es decir, el deporte de
dicha cancha, ubicación en el predio, cantidad de deportistas para la cancha; y días, horarios y duración del turno de
esa cancha.

El canchero puede solicitar en cualquier momento un informe que detalle la ocupación de las canchas en un
determinado día y los ingresos obtenidos (solo aquellos ingresos que fueron cobrados).